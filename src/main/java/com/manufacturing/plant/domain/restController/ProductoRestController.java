package com.manufacturing.plant.domain.restController;

import com.manufacturing.plant.domain.service.ProductoService;
import com.manufacturing.plant.persistence.entity.Producto;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/productos/")
public class ProductoRestController {
    @Autowired
    private ProductoService productoService;

    @GetMapping("/all")
    @ApiOperation("Get all supermarket products")
    @ApiResponse(code = 200, message = "OK")
    public ResponseEntity<List<Producto>> getAll(){
        return new ResponseEntity<>(productoService.findAll(), HttpStatus.OK);
    }

    /**
     * Realiza GET de producto en especifico por el ID
     * */
    @GetMapping("/{id}")
    @ApiOperation("Search a product with an ID")
    @ApiResponses({
            @ApiResponse(code = 200, message = "OK"),
            @ApiResponse(code = 404, message = "Product not found")
    })
    public ResponseEntity<Object> getProduct(@ApiParam(value = "The id of the product", required = true, example = "7")
                                              @PathVariable("id") Long productId){
        return productoService.getProduct(productId)
                .map(product -> new ResponseEntity<>(product, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    /**
     *Realiza GET de una categoria en especifico por el ID
     * */
    @GetMapping("/category/{categoriId}")
    public HttpEntity<Object> getByCategory(@PathVariable("categoriId") int categoryId){
        return productoService.getByCategory(categoryId)
                .map(products -> new ResponseEntity<>(products, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    /**
     * Realiza un POST en el cual guarda el registro
     * */
    @PostMapping("/save")
    public ResponseEntity<Producto> save(@RequestBody Producto product){
        return new ResponseEntity<>(productoService.save(product), HttpStatus.CREATED);
    }

    /**
     * Realiza un DELETE en el cual borra el registro que pongamos por el ID
     * */
    @DeleteMapping("/delete/{id}")
    public ResponseEntity delete(@PathVariable("id") Long productId){
        if(productoService.delete(productId)){
            return new ResponseEntity(HttpStatus.OK);
        } else {
            return new ResponseEntity(HttpStatus.NOT_FOUND);
        }
    }

}

package com.manufacturing.plant.domain.restController;

import com.manufacturing.plant.domain.service.CategoriaService;
import com.manufacturing.plant.persistence.entity.Categoria;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/categoria/")
public class CategoriaRestController {
    @Autowired(required = false)
    private CategoriaService categoriaService;

    @GetMapping
    private ResponseEntity<List<Categoria>> getAllCategory() {
        return new ResponseEntity<>(categoriaService.findAll(), HttpStatus.OK);
    }
}

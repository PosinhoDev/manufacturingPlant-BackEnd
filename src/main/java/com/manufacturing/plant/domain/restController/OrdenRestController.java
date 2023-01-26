package com.manufacturing.plant.domain.restController;

import com.manufacturing.plant.domain.service.OrdenCompraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/orden_compra/")
public class OrdenRestController {
    @Autowired
    private OrdenCompraService ordenCompraService;


}

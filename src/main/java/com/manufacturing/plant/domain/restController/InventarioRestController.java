package com.manufacturing.plant.domain.restController;

import com.manufacturing.plant.domain.service.InventarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/inventario/")
public class InventarioRestController {

    @Autowired
    private InventarioService inventarioService;



}

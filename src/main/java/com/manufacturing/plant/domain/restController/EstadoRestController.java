package com.manufacturing.plant.domain.restController;

import com.manufacturing.plant.domain.service.EstadoService;
import com.manufacturing.plant.persistence.entity.Estado;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/estado/")
public class EstadoRestController {
    @Autowired(required = false)
    private EstadoService estadoService;

    @GetMapping
    private ResponseEntity<List<Estado>> gettAllStates() {
        return ResponseEntity.ok(estadoService.findAll());
    }
}

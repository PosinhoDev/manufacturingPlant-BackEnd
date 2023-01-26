package com.manufacturing.plant.domain.repository;

import com.manufacturing.plant.persistence.entity.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductoRespository extends JpaRepository<Producto, Long> {
}

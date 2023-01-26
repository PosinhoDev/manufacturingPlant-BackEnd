package com.manufacturing.plant.domain.repository;

import com.manufacturing.plant.persistence.entity.Inventario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InventarioRepository extends JpaRepository<Inventario, Long> {
}

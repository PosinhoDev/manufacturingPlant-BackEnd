package com.manufacturing.plant.domain.repository;

import com.manufacturing.plant.persistence.entity.Orden_Compra;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrdenRepository extends JpaRepository<Orden_Compra, Long> {
}

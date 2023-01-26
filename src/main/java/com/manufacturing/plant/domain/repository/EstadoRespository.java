package com.manufacturing.plant.domain.repository;

import com.manufacturing.plant.persistence.entity.Estado;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EstadoRespository extends JpaRepository<Estado, Long> {
}

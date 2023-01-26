package com.manufacturing.plant.domain.repository;

import com.manufacturing.plant.persistence.entity.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {

}

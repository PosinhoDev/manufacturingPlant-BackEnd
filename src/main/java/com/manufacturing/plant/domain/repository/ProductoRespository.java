package com.manufacturing.plant.domain.repository;

import com.manufacturing.plant.persistence.entity.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ProductoRespository extends JpaRepository<Producto, Long> {
    Optional<Object> getByCategory(int categoryId);

    Object delete(Long productId);
}

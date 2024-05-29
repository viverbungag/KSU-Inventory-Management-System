package com.ksu.inventory_management_system_backend.entities.product;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface JpaProductRepository extends JpaRepository<Product, Long>{

    Optional<Product> findByName(String name);
    Optional<Product> findById(long id);
}

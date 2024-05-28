package com.ksu.inventory_management_system_backend.entities.product;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JpaProductRepository extends JpaRepository<Product, Long>{

    Product findByName(String name);
    Product findById(long id);
}

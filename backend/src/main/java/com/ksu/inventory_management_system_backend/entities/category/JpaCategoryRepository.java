package com.ksu.inventory_management_system_backend.entities.category;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface JpaCategoryRepository extends JpaRepository<Category, Long>{

    Optional<Category> findByName(String name);
    Optional<Category> findById(long id);

}

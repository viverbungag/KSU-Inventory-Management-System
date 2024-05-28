package com.ksu.inventory_management_system_backend.entities.category;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JpaCategoryRepository extends JpaRepository<Category, Long>{

    Category findByName(String name);
    Category findById(long id);

}

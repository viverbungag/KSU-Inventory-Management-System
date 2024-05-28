package com.ksu.inventory_management_system_backend.entities.supplier;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JpaSupplierRepository extends JpaRepository<Supplier, Long>{
    Supplier findByName(String name);
    Supplier findById(long id);
}

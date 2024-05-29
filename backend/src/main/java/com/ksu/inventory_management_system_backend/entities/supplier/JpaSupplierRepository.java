package com.ksu.inventory_management_system_backend.entities.supplier;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface JpaSupplierRepository extends JpaRepository<Supplier, Long>{
    Optional<Supplier> findByName(String name);
    Optional<Supplier> findById(long id);
}

package com.ksu.inventory_management_system_backend.entities.unit;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JpaUnitRepository extends JpaRepository<Unit, Long> {

    Unit findByName(String name);
    Unit findById(long id);
}

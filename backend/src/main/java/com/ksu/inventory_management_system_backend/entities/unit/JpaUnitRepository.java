package com.ksu.inventory_management_system_backend.entities.unit;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface JpaUnitRepository extends JpaRepository<Unit, Long> {

    Optional<Unit> findByName(String name);
    Optional<Unit> findById(long id);
}

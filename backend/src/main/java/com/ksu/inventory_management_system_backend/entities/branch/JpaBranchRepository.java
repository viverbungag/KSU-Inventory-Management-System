package com.ksu.inventory_management_system_backend.entities.branch;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface JpaBranchRepository extends JpaRepository<Branch, Long>{

    Optional<Branch> findByName(String name);
    Optional<Branch> findById(long id);
}

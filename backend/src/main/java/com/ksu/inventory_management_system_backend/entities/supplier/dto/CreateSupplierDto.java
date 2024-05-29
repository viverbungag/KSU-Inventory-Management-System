package com.ksu.inventory_management_system_backend.entities.supplier.dto;

public record CreateSupplierDto(
        String name,
        String contactNumber,
        String address
){}

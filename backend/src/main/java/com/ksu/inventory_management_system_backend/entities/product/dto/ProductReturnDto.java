package com.ksu.inventory_management_system_backend.entities.product.dto;

public record ProductReturnDto(Long id, String name, Float minimumQuantity, ProductReturnDtoTempSupplier supplier) {}

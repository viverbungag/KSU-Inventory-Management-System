package com.ksu.inventory_management_system_backend.entities.product.Dto;

public record ProductReturnDto(Long id, String name, Float quantity, Float minimumQuantity, ProductReturnDtoTempSupplier supplier) {}

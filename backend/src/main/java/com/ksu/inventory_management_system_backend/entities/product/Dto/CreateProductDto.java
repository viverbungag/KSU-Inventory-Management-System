package com.ksu.inventory_management_system_backend.entities.product.Dto;

public record CreateProductDto(String name, Float quantity, Float minimumQuantity) {
}

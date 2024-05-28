package com.ksu.inventory_management_system_backend.entities.product;

import com.ksu.inventory_management_system_backend.entities.product.Dto.CreateProductDto;
import com.ksu.inventory_management_system_backend.entities.product.Dto.ProductReturnDto;

import java.util.Collection;

public interface ProductService {
    void createProduct(CreateProductDto createProductDto);
    void updateProduct(long id, CreateProductDto createProductDto);
    ProductReturnDto getProduct(long id);
    void deleteProduct(long id);
    ProductReturnDto getProductByName(String name);
    Collection<ProductReturnDto> getAllProducts();
}

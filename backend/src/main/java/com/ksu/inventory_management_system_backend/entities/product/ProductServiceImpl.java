package com.ksu.inventory_management_system_backend.entities.product;

import com.ksu.inventory_management_system_backend.entities.product.Dto.CreateProductDto;
import com.ksu.inventory_management_system_backend.entities.product.Dto.ProductReturnDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService{

    private final JpaProductRepository jpaProductRepository;

    @Override
    public void createProduct(CreateProductDto createProductDto) {
        jpaProductRepository.save(Product.from(createProductDto));
    }

    @Override
    public void updateProduct(long id, CreateProductDto createProductDto) {
        jpaProductRepository.save(Product.from(createProductDto));
    }

    @Override
    public ProductReturnDto getProduct(long id) {
        Product product = jpaProductRepository.findById(id);
        return Product.convertToReturnDto(product);
    }

    @Override
    public void deleteProduct(long id) {
        jpaProductRepository.deleteById(id);
    }

    @Override
    public ProductReturnDto getProductByName(String name) {
        Product product = jpaProductRepository.findByName(name);
        return Product.convertToReturnDto(product);
    }

    @Override
    public Collection<ProductReturnDto> getAllProducts() {
        Collection<Product> products = jpaProductRepository.findAll();
        return Product.convertToReturnDto(products);
    }

}

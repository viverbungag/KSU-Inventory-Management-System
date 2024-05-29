package com.ksu.inventory_management_system_backend.entities.product;

import com.ksu.inventory_management_system_backend.entities.branch.Branch;
import com.ksu.inventory_management_system_backend.entities.product.dto.CreateProductDto;
import com.ksu.inventory_management_system_backend.entities.product.dto.ProductReturnDto;
import com.ksu.inventory_management_system_backend.exceptions.ReferentialIntegrityViolationException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService{

    private final JpaProductRepository productRepository;

    @Override
    public void createProduct(CreateProductDto createProductDto) {
        Product product = Product.from(createProductDto);
        productRepository.save(product);
    }

    @Override
    public void updateProduct(long id, CreateProductDto createProductDto) {
        Optional<Product> optionalProduct = productRepository.findById(id);
        if (optionalProduct.isPresent()) {
            Product product = optionalProduct.get();
            product.setName(createProductDto.name());
            product.setQuantity(createProductDto.quantity());
            product.setMinimumQuantity(createProductDto.minimumQuantity());
            productRepository.save(product);
        } else {
            throw new ReferentialIntegrityViolationException("Product with id " + id + " does not exist");
        }
    }

    @Override
    public ProductReturnDto getProduct(long id) {
        Product product = productRepository.findById(id).orElseThrow(
                () -> new ReferentialIntegrityViolationException("Product with id " + id + " not found"));
        return Product.convertToReturnDto(product);
    }

    @Override
    public void deleteProduct(long id) {
        if (!productRepository.existsById(id)) {
            throw new ReferentialIntegrityViolationException("Product with id " + id + " does not exist");
        }
        productRepository.deleteById(id);
    }

    @Override
    public ProductReturnDto getProductByName(String name) {
        Product product = productRepository.findByName(name).orElseThrow(
                () -> new ReferentialIntegrityViolationException("Product with name " + name + " not found"));
        return Product.convertToReturnDto(product);
    }

    @Override
    public Collection<ProductReturnDto> getAllProducts() {
        Collection<Product> products = productRepository.findAll();
        return Product.convertToReturnDto(products);
    }

}

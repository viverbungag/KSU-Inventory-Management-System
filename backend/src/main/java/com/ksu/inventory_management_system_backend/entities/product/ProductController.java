package com.ksu.inventory_management_system_backend.entities.product;

import com.ksu.inventory_management_system_backend.entities.product.dto.CreateProductDto;
import com.ksu.inventory_management_system_backend.entities.product.dto.ProductReturnDto;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping("/api/v1/products")
@RequiredArgsConstructor
public class ProductController {

        private final ProductService productService;

         @PostMapping
         @ResponseStatus(HttpStatus.CREATED)
         public void createProduct(@RequestBody CreateProductDto createProductDto) {
             productService.createProduct(createProductDto);
         }

         @GetMapping
         @ResponseStatus(HttpStatus.OK)
         public Collection<ProductReturnDto> getProducts() {
             return productService.getAllProducts();
         }

         @GetMapping("/{id}")
         @ResponseStatus(HttpStatus.OK)
         public ProductReturnDto getProduct(@PathVariable long id) {
             return productService.getProduct(id);
         }

         @PutMapping("/{id}")
         @ResponseStatus(HttpStatus.OK)
         public void updateProduct(@PathVariable long id, @RequestBody CreateProductDto createProductDto) {
             productService.updateProduct(id, createProductDto);
         }

         @DeleteMapping("/{id}")
         @ResponseStatus(HttpStatus.NO_CONTENT)
         public void deleteProduct(@PathVariable long id) {
             productService.deleteProduct(id);
         }

}

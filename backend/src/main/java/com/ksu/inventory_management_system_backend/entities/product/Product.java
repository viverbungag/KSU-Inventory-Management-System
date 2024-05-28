package com.ksu.inventory_management_system_backend.entities.product;

import com.ksu.inventory_management_system_backend.entities.product.Dto.CreateProductDto;
import com.ksu.inventory_management_system_backend.entities.product.Dto.ProductReturnDto;
import com.ksu.inventory_management_system_backend.entities.product.Dto.ProductReturnDtoTempSupplier;
import com.ksu.inventory_management_system_backend.entities.supplier.Supplier;
import jakarta.persistence.*;
import lombok.*;

import java.util.Collection;

@Entity(name = "product")
@ToString
@NoArgsConstructor
@RequiredArgsConstructor
@Getter
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "name")
    @Setter
    @NonNull
    private String name;

    @Column(name = "quantity")
    @Setter
    @NonNull
    private Float quantity;

    @Column(name = "minimum_quantity")
    @Setter
    @NonNull
    private Float minimumQuantity;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "supplier_id")
    @Setter
    @ToString.Exclude
    private Supplier supplier;

    public static Product from(CreateProductDto createProductDto) {
        return new Product(createProductDto.name(), createProductDto.quantity(), createProductDto.minimumQuantity());
    }

    public static ProductReturnDto convertToReturnDto(Product product) {
        ProductReturnDtoTempSupplier supplier = new ProductReturnDtoTempSupplier(product.getSupplier().getName(), product.getSupplier().getContactNumber(), product.getSupplier().getAddress());
        return new ProductReturnDto(product.getId(),product.getName(), product.getQuantity(), product.getMinimumQuantity(), supplier);
    }

    public static Collection<ProductReturnDto> convertToReturnDto(Collection<Product> products) {
        return products.stream().map(Product::convertToReturnDto).toList();
    }
}

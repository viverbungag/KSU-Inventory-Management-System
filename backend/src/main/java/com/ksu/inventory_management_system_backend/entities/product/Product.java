package com.ksu.inventory_management_system_backend.entities.product;

import com.ksu.inventory_management_system_backend.entities.category.Category;
import com.ksu.inventory_management_system_backend.entities.joins.BranchProduct;
import com.ksu.inventory_management_system_backend.entities.product.dto.CreateProductDto;
import com.ksu.inventory_management_system_backend.entities.product.dto.ProductReturnDto;
import com.ksu.inventory_management_system_backend.entities.product.dto.ProductReturnDtoTempSupplier;
import com.ksu.inventory_management_system_backend.entities.size.Size;
import com.ksu.inventory_management_system_backend.entities.supplier.Supplier;
import com.ksu.inventory_management_system_backend.entities.unit.Unit;
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

    @Column(name = "minimum_quantity")
    @Setter
    @NonNull
    private Float minimumQuantity;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "supplier_id")
    @Setter
    @ToString.Exclude
    private Supplier supplier;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "category_id")
    @Setter
    @ToString.Exclude
    private Category category;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "unit_id")
    @Setter
    @ToString.Exclude
    private Unit unit;

    @Setter
    @OneToMany(mappedBy = "product", fetch = FetchType.LAZY)
    @ToString.Exclude
    private Collection<Size> sizes;

    @Setter
    @OneToMany(mappedBy = "product", fetch = FetchType.LAZY)
    @ToString.Exclude
    Collection<BranchProduct> branchProducts;

    public static Product from(CreateProductDto createProductDto) {
        return new Product(createProductDto.name(), createProductDto.minimumQuantity());
    }

    public static ProductReturnDto convertToReturnDto(Product product) {
        ProductReturnDtoTempSupplier supplier = new ProductReturnDtoTempSupplier(product.getSupplier().getName(), product.getSupplier().getContactNumber(), product.getSupplier().getAddress());
        return new ProductReturnDto(product.getId(),product.getName(), product.getMinimumQuantity(), supplier);
    }

    public static Collection<ProductReturnDto> convertToReturnDto(Collection<Product> products) {
        return products.stream().map(Product::convertToReturnDto).toList();
    }
}

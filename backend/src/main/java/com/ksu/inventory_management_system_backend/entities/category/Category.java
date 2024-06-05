package com.ksu.inventory_management_system_backend.entities.category;

import com.ksu.inventory_management_system_backend.entities.category.dto.CreateCategoryDto;
import com.ksu.inventory_management_system_backend.entities.product.Product;
import com.ksu.inventory_management_system_backend.entities.size.Size;
import jakarta.persistence.*;
import lombok.*;

import java.util.Collection;

@Entity(name = "category")
@ToString
@NoArgsConstructor
@RequiredArgsConstructor
@Getter
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "name")
    @Setter
    @NonNull
    private String name;

    @Setter
    @OneToMany(mappedBy = "category", fetch = FetchType.LAZY)
    @ToString.Exclude
    private Collection<Product> products;

    public static Category from(CreateCategoryDto createCategoryDto) {
        return new Category(createCategoryDto.name());
    }
}

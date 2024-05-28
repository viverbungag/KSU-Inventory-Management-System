package com.ksu.inventory_management_system_backend.entities.category;

import jakarta.persistence.*;
import lombok.*;

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

    public static Category from(CreateCategoryDto createCategoryDto) {
        return new Category(createCategoryDto.name());
    }
}

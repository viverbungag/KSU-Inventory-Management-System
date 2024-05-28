package com.ksu.inventory_management_system_backend.entities.category;

import com.ksu.inventory_management_system_backend.entities.category.Dto.CreateCategoryDto;

interface CategoryService {

    void createCategory(CreateCategoryDto createCategoryDto);
    void updateCategory(CreateCategoryDto createCategoryDto);
    Category getCategory(Long id);
    void deleteCategory(Long id);
    Iterable<Category> getCategories();
}

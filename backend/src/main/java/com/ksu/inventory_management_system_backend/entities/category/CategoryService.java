package com.ksu.inventory_management_system_backend.entities.category;

import com.ksu.inventory_management_system_backend.entities.category.dto.CreateCategoryDto;

interface CategoryService {

    void createCategory(CreateCategoryDto createCategoryDto);
    void updateCategory(long id, CreateCategoryDto createCategoryDto);
    Category getCategory(Long id);
    void deleteCategory(Long id);
    Iterable<Category> getAllCategories();
}

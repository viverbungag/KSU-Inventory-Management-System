package com.ksu.inventory_management_system_backend.entities.category;

interface CategoryService {

    void createCategory(CreateCategoryDto createCategoryDto);
    void updateCategory(CreateCategoryDto createCategoryDto);
    Category getCategory(Long id);
    void deleteCategory(Long id);
    Iterable<Category> getCategories();
}

package com.ksu.inventory_management_system_backend.category;

public interface CategoryService {

    void createCategory(Category category);
    void updateCategory(Category category);
    Category getCategory(Long id);
    void deleteCategory(Long id);
    Iterable<Category> getCategories();
}

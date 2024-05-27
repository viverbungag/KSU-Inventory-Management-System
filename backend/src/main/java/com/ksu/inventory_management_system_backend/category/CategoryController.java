package com.ksu.inventory_management_system_backend.category;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/v1/categories")
@RequiredArgsConstructor
public class CategoryController {

    private final CategoryService categoryService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void createCategory(@RequestBody Category category) {
        categoryService.createCategory(category);
    }

    @PutMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public void updateCategory(@PathVariable Long id, @RequestBody Category category) {
        categoryService.updateCategory(category);
    }

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Category getCategory(@PathVariable Long id) {
        return categoryService.getCategory(id);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteCategory(@PathVariable Long id) {
        categoryService.deleteCategory(id);
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public Iterable<Category> getCategories() {
        return categoryService.getCategories();
    }
}

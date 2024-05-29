package com.ksu.inventory_management_system_backend.entities.category;

import com.ksu.inventory_management_system_backend.entities.branch.Branch;
import com.ksu.inventory_management_system_backend.entities.category.dto.CreateCategoryDto;
import com.ksu.inventory_management_system_backend.exceptions.ReferentialIntegrityViolationException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class CategoryServiceImpl implements CategoryService {

    private final JpaCategoryRepository categoryRepository;

    @Override
    public void createCategory(CreateCategoryDto createCategoryDto) {
        Category category = Category.from(createCategoryDto);
        categoryRepository.save(category);
    }

    @Override
    public void updateCategory(long id, CreateCategoryDto createCategoryDto) {
        Optional<Category> optionalCategory = categoryRepository.findById(id);
        if (optionalCategory.isPresent()) {
            Category category = optionalCategory.get();
            category.setName(createCategoryDto.name());
            categoryRepository.save(category);
        } else {
            throw new ReferentialIntegrityViolationException("Category with id " + id + " does not exist");
        }
    }

    @Override
    public Category getCategory(Long id) {
        return categoryRepository.findById(id).orElseThrow(() -> new ReferentialIntegrityViolationException("Category with id " + id + " does not exist"));
    }

    @Override
    public void deleteCategory(Long id) {
        if (categoryRepository.existsById(id)) {
            categoryRepository.deleteById(id);
        } else {
            throw new ReferentialIntegrityViolationException("Category with id " + id + " does not exist");
        }
    }

    @Override
    public Iterable<Category> getAllCategories() {
        return categoryRepository.findAll();
    }
}

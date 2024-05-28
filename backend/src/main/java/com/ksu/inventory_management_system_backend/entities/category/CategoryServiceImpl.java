package com.ksu.inventory_management_system_backend.entities.category;

import com.ksu.inventory_management_system_backend.entities.category.Dto.CreateCategoryDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CategoryServiceImpl implements CategoryService {

        private final JpaCategoryRepository jpaCategoryRepository;

        @Override
        public void createCategory(CreateCategoryDto createCategoryDto) {
            jpaCategoryRepository.save(Category.from(createCategoryDto));
        }

        @Override
        public void updateCategory(CreateCategoryDto createCategoryDto) {
            jpaCategoryRepository.save(Category.from(createCategoryDto));
        }

        @Override
        public Category getCategory(Long id) {
            return jpaCategoryRepository.findById(id).orElse(null);
        }

        @Override
        public void deleteCategory(Long id) {
            jpaCategoryRepository.deleteById(id);
        }

        @Override
        public Iterable<Category> getCategories() {
            return jpaCategoryRepository.findAll();
        }
}

package com.ksu.inventory_management_system_backend.category;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CategoryServiceImpl implements CategoryService {

        private final JpaCategoryRepository jpaCategoryRepository;

        @Override
        public void createCategory(Category category) {
            jpaCategoryRepository.save(category);
        }

        @Override
        public void updateCategory(Category category) {
            jpaCategoryRepository.save(category);
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

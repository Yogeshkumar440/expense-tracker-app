package com.yogesh.expense.service.impl;

import com.yogesh.expense.dto.CategoryDto;
import com.yogesh.expense.entity.Category;
import com.yogesh.expense.mapper.CategoryMapper;
import com.yogesh.expense.repository.CategoryRepository;
import com.yogesh.expense.service.CategoryService;
import org.springframework.stereotype.Service;

@Service
public class CategoryServiceImpl implements CategoryService {

    private final CategoryRepository categoryRepository;

    public CategoryServiceImpl(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    @Override
    public CategoryDto createCategory(CategoryDto categoryDto) {
        // convert CategoryDto to Category entity
        Category category = CategoryMapper.mapToCategory(categoryDto);

        // save category object into database table - categories
        Category savedCategory = categoryRepository.save(category);

        // convert savedCategory to CategoryDto
        return CategoryMapper.mapToCategoryDto(savedCategory);
    }

    @Override
    public CategoryDto getCategoryById(Long categoryId) {
        Category category = categoryRepository.findById(categoryId)
                .orElseThrow(() -> new RuntimeException("Category not found with id: " + categoryId));

        return CategoryMapper.mapToCategoryDto(category);
    }
}

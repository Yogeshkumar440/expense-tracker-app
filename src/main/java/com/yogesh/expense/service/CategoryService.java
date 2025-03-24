package com.yogesh.expense.service;

import com.yogesh.expense.dto.CategoryDto;

public interface CategoryService {

    CategoryDto createCategory(CategoryDto categoryDto);

    CategoryDto getCategoryById(Long categoryId);
}

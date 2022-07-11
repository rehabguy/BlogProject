package com.rk.service;

import com.rk.dto.CategoryDto;
import com.rk.model.Category;
import com.rk.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CategoryService {
    @Autowired
    private CategoryRepository categoryRepository;

    public List<CategoryDto> getAll(){
        List<Category> categories=categoryRepository.findAll();
        return categories.stream().map(category -> new CategoryDto(category.getCategoryname())).collect(Collectors.toList());
    }
}

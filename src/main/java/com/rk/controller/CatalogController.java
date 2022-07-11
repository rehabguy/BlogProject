package com.rk.controller;

import com.rk.dto.CategoryDto;
import com.rk.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static org.springframework.http.HttpStatus.OK;

@RestController
@RequestMapping("/cat")
public class CatalogController {
    @Autowired
    private CategoryService categoryService;

    @GetMapping("categories")
    public ResponseEntity<List<CategoryDto>> readAllCategories() {
        return new ResponseEntity<>(categoryService.getAll(), OK);
    }

}

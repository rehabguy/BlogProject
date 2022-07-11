package com.rk.controller;

import com.rk.dto.ItemDto;
import com.rk.model.Item;
import com.rk.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/item")
public class ItemController {
    @Autowired
    private ItemService itemService;

    @PostMapping("/save")
    public void save(@RequestBody ItemDto itemDto){
        itemService.save(itemDto);
    }

    @GetMapping("/all")
    public List<Item> geta(ItemDto itemDto){
        return itemService.getAll(itemDto);
    }


}

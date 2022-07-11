package com.rk.service;

import com.rk.dto.ItemDto;
//import com.rk.mapper.ItemMapper;
import com.rk.model.Category;
import com.rk.model.Item;
import com.rk.repository.CategoryRepository;
import com.rk.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ItemService {
    @Autowired
    private ItemRepository itemRepository;
//    @Autowired
//    private CategoryRepository categoryRepository;
//    @Autowired
//    private ItemMapper itemMapper;

    @Transactional
    public void save(ItemDto itemDto){
      //  Category category = categoryRepository.findByCategoryname(itemDto.getCategoryname());

        Item item =  new Item();
        item.setItemid(itemDto.getItemid());
        item.setCategory(new Category(itemDto.getCategoryname()));
//        item.setCategory(category);
        item.setDescription(itemDto.getDescription());
        item.setPrice(itemDto.getPrice());
        item.setName(itemDto.getName());
        itemRepository.save(item);
    }

    public List<Item> getAll(ItemDto itemDto){
        List<Item> items=itemRepository.findAll();
        return items.stream().collect(Collectors.toList());
    }

}

package com.rk.repository;

import com.rk.model.Category;
import com.rk.model.Item;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ItemRepository extends JpaRepository<Item,Integer> {
    Optional<Item> findByCategory(Category category);
    Item findByName(String name);
}

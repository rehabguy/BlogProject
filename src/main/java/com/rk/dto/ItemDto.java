package com.rk.dto;

import com.rk.model.Category;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ItemDto {
    private int itemid;
    private String description;
    private String name;
    private double price;
    private String categoryname;
}

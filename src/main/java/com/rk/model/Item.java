package com.rk.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Cascade;

import javax.persistence.*;

import static javax.persistence.FetchType.LAZY;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Item {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int itemid;
    private String description;
    private String name;
    private double price;
    @ManyToOne(fetch = LAZY,cascade=CascadeType.ALL)
    private Category category;

    public Item(String name){
        this.name=name;
    }
}

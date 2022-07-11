package com.rk.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

import static javax.persistence.FetchType.LAZY;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="Orderr")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int order_id;
    private int totalamount;
    @ManyToOne(cascade=CascadeType.ALL)
 //@JoinColumn(name="id",insertable=false, updatable=false)
    private User user;
    @ManyToOne(cascade=CascadeType.ALL)
  // @JoinColumn(name="itemid",insertable=false, updatable=false)
    private Item item;
}

package com.rk.repository;

import com.rk.model.Item;
import com.rk.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.criteria.CriteriaBuilder;

@Repository
public interface OrderRepository extends JpaRepository<Order, Integer> {
  //  public Order findByUsername(String username);

    //public Item findByName(String itemname);
}

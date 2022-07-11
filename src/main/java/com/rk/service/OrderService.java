package com.rk.service;

import com.rk.dto.OrderDto;
import com.rk.model.Item;
import com.rk.model.Order;
import com.rk.model.User;
import com.rk.repository.ItemRepository;
import com.rk.repository.OrderRepository;
import com.rk.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
public class OrderService {
    @Autowired
    private OrderRepository orderRepository;
    @Autowired
    private ItemRepository itemRepository;
    @Autowired
    private UserRepository userRepository;

    @Transactional
    public void placeOrder(OrderDto orderDto){
        User user = userRepository.findByUsername(orderDto.getUsername());
        Item item= itemRepository.findByName(orderDto.getName());


        Order order=new Order();
        order.setTotalamount(orderDto.getTotalamount());

        order.setUser(user);
        order.setItem(item);

        orderRepository.save(order);
    }

}

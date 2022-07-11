package com.rk.controller;

import com.rk.dto.OrderDto;
import com.rk.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/order")
public class OrderController {
    @Autowired
    private OrderService orderService;

    @PostMapping("/place")
    public void place(@RequestBody OrderDto orderDto){
        orderService.placeOrder(orderDto);
    }
}

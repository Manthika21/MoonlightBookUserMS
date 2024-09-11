package com.example.Order.controller;


import com.example.Order.data.Order;
import com.example.Order.service.OrderService;
import org.aspectj.weaver.ast.Or;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class OrderController {

    @Autowired
    private OrderService orderService;


    @GetMapping("/orders/{userid}")
    public List<Order> getOrdersByUserId(@PathVariable int userid) {
        return orderService.getOrdersByUserId(userid);
    }

    @PostMapping(path = "/orders")
    public Order createOrder(@RequestBody Order order){
        return orderService.createOrder(order);
    }
}

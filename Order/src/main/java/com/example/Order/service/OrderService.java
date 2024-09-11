package com.example.Order.service;



import com.example.Order.data.Order;
import com.example.Order.data.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.Optional;

@Service
public class OrderService {

    @Autowired                   // Spring container inject dependancies into below reference variable at runtime
    private OrderRepository orderRepository;


    public List<Order> getOrders(){
        return orderRepository.findAll();
    }

    public List<Order> getOrdersByUserId(int userid) {
        return orderRepository.findByUserid(userid);
    }

    public Order createOrder(Order order){
        return orderRepository.save(order);
    }


}

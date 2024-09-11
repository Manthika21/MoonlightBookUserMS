package com.example.Order.controller;


import com.example.Order.data.Cart;

import com.example.Order.data.Order;
import com.example.Order.service.CartService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CartController {

    @Autowired
    private CartService cartService;


    @GetMapping("/cart/{userid}")
    public List<Cart> cartItemsByID(@PathVariable int userid) {
        return cartService.getCartItemsByUserID(userid);
    }

    @PostMapping(path = "/cart/add")
    public Cart addCartItem(@RequestBody Cart cart){
        return cartService.addCartItem(cart);
    }

}

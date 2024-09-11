package com.example.Order.data;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CartRepository extends  JpaRepository<Cart, Integer>{

    List<Cart> findCartItemsByUserid(int userid);
}

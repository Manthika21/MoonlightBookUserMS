package com.example.Order.data;


import jakarta.persistence.*;

import java.sql.Time;

@Entity
@Table(name = "shopping_cart")
public class Cart {

    @Id                                                     //this is going to represent the pk
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "cart_item_id ")
    private int cart_item_id;

    @Column(name = "user_id")
    private int userid;

    @Column(name = "book_id")
    private int book_id;

    @Column(name = "quantity")
    private int quantity;

    @Column(name = "added_at")
    private Time added_at;

    public int getCart_item_id() {
        return cart_item_id;
    }

    public void setCart_item_id(int cart_item_id) {
        this.cart_item_id = cart_item_id;
    }

    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    public int getBook_id() {
        return book_id;
    }

    public void setBook_id(int book_id) {
        this.book_id = book_id;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Time getAdded_at() {
        return added_at;
    }

    public void setAdded_at(Time added_at) {
        this.added_at = added_at;
    }
}

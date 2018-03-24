package com.luuva.model;

/**
 * Created by My PC on 3/24/2018.
 */

public class Product {
    private int id;
    private int userId;
    private int price;
    private String name;
    private int picture;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPicture() {
        return picture;
    }

    public void setPicture(int picture) {
        this.picture = picture;
    }
    public Product(int id, int userId, int price, String name, int picture) {
        this.id = id;
        this.userId = userId;
        this.price = price;
        this.name = name;
        this.picture = picture;
    }
}


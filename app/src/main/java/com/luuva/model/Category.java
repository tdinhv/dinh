package com.luuva.model;

/**
 * Created by luuva on 3/9/2018.
 */

public class Category {
    private int id;
    private String name;
    private int picture;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public Category(int id, String name, int picture) {
        this.id = id;
        this.name = name;
        this.picture = picture;
    }

    public Category() {
    }
}

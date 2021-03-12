package com.company.OOP.Tasks.Task5.Elements;


import java.util.Objects;

public  class Flower extends Element {
    private String sort;
    private String color;
    private int size;

    public Flower(String sort, String color, int size, int price) {
        super(price);
        this.sort = sort;
        this.color = color;
        this.size = size;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setSort(String sort) {
        this.sort = sort;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public void setPrice(int price) {
        super.setPrice(price);
    }

    public int getSize() {
        return size;
    }

    public String getSort() {
        return sort;
    }

    public String getColor() {
        return color;
    }

    @Override
    public int getPrice() {
        return super.getPrice();
    }

    @Override
    public String toString() {
        return "Flower{" +
                "sort=" + sort +
                ", color=" + color +
                ", size=" + size +
                ", price=" +
                getPrice() +
                "$}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Flower flower = (Flower) o;
        return size == flower.size &&
                sort == flower.sort &&
                color == flower.color;
    }

}
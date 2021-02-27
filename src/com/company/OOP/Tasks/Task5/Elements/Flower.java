package com.company.OOP.Tasks.Task5.Elements;

import com.company.OOP.Tasks.Task5.Enams.Color;
import com.company.OOP.Tasks.Task5.Enams.SortFlower;

import java.util.Objects;

public  class Flower extends Element {
    private SortFlower sort;
    private Color color;
    private int size;

    public Flower(SortFlower sort, Color color, int size, int price) {
        super(price);
        this.sort = sort;
        this.color = color;
        this.size = size;
    }

    public void setColor(Color color) {
        this.color = color;
    }
    public Color getColor() {
        return color;
    }

    public SortFlower getSort() {
        return sort;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void setSort(SortFlower sort) {
        this.sort = sort;
    }

    @Override
    public String toString() {
        return "Flower{" +
                "sort=" + sort +
                ", color=" + color +
                ", size=" + size +
                ", price="+
                getPrice()+
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

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), sort, color, size);
    }
}

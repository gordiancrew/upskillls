package com.company.OOP.Tasks.Task5.Elements;

import java.util.Objects;

public  class Element {
    private int price;
    public  Element(int price){
        this.price=price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Element{" +
                "price=" + price +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Element element = (Element) o;
        return price == element.price;
    }

    @Override
    public int hashCode() {
        return Objects.hash(price);
    }
}

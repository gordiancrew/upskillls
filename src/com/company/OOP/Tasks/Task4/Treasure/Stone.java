package com.company.OOP.Tasks.Task4.Treasure;

public class Stone extends Treasure {
    private String color;

    public Stone(String name,int price, String color) {
        super(name, price);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Stone{" +

                "name='" + getName() + '\'' +
                ", price=" + getPrice() +
                ", color='" + getColor() + '\'' +
                '}';
    }
}

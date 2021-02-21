package com.company.OOP.Tasks.Task4.Treasure;

public class Coins extends Treasure {
    private String metal;
    public Coins(String name, int price, String metal) {
        super(name, price);
        this.metal=metal;

    }

    public String getMetal() {
        return metal;
    }

    public void setMetal(String metal) {
        this.metal = metal;
    }

    @Override
    public String toString() {
        return "Coins{" +

                "name='" + getName() + '\'' +
                ", price=" + getPrice() +
                ", metal='" + getMetal() + '\'' +
                '}';
    }
}

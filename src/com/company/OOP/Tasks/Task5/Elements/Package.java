package com.company.OOP.Tasks.Task5.Elements;



public class Package extends Element {
    String color;
    public Package(int price, String color){
        super(price);
        this.color=color;
    }

    public String getColor() {
        return color;
    }

    @Override
    public void setPrice(int price) {
        super.setPrice(price);
    }

    @Override
    public int getPrice() {
        return super.getPrice();
    }
}

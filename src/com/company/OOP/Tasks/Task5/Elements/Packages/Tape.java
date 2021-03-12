package com.company.OOP.Tasks.Task5.Elements.Packages;

import com.company.OOP.Tasks.Task5.Elements.Package;

public class Tape extends Package {
    public Tape(String color, int price ) {
        super(price, color);
    }

    @Override
    public int getPrice() {
        return super.getPrice();
    }

    @Override
    public String getColor() {
        return super.getColor();
    }

    @Override
    public void setPrice(int price) {
        super.setPrice(price);
    }

    @Override
    public String toString() {
       return  "Tape{" +
                "color="+getColor()+
                " ,price="+getPrice()+
                "$}";
    }
}

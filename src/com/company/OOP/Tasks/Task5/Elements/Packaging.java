package com.company.OOP.Tasks.Task5.Elements;


import com.company.OOP.Tasks.Task5.Enams.Color;

public class Packaging extends Element {
    Color color;
    public Packaging(int price, Color color){
        super(price);
        this.color=color;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public int getPrice() {
        return super.getPrice();
    }
}

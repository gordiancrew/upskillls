package com.company.OOP.Tasks.Task5.Elements.Packagings;

import com.company.OOP.Tasks.Task5.Elements.Packaging;
import com.company.OOP.Tasks.Task5.Enams.Color;

public class Tape extends Packaging {
    public Tape(Color color, int price ) {
        super(price, color);
    }

    @Override
    public int getPrice() {
        return super.getPrice();
    }

    @Override
    public Color getColor() {
        return super.getColor();
    }


    @Override
    public String toString() {
       return  "Tape{" +
                "color="+getColor()+
                " ,price="+getPrice()+
                "$}";
    }
}

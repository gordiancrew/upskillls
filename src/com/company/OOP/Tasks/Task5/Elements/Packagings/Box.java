package com.company.OOP.Tasks.Task5.Elements.Packagings;


import com.company.OOP.Tasks.Task5.Elements.Packaging;

import com.company.OOP.Tasks.Task5.Enams.Color;
import com.company.OOP.Tasks.Task5.Enams.TypeBox;

public class Box extends Packaging {


    private TypeBox typeBox;

    public  Box(TypeBox typeBox, Color color,int price){
        super(price,color);
        this.typeBox=typeBox;
    }

    public TypeBox getTypeBox() {
        return typeBox;
    }

    public void setTypeBox(TypeBox typeBox) {
        this.typeBox = typeBox;
    }

    @Override
    public String toString() {
        return "Box{" +
                "typeBox=" + typeBox +
                ", color="+getColor()+
                ", price="+getPrice()+
                "$}";
    }
}

package com.company.OOP.Tasks.Task5.Elements.Packages;


import com.company.OOP.Tasks.Task5.Elements.Package;



public class Box extends Package {


    private String typeBox;

    public  Box(String typeBox, String color,int price){
        super(price,color);
        this.typeBox=typeBox;
    }

    @Override
    public void setPrice(int price) {
        super.setPrice(price);
    }

    public void setTypeBox(String typeBox) {
        this.typeBox = typeBox;
    }

    @Override
    public int getPrice() {
        return super.getPrice();
    }

    @Override
    public String getColor() {
        return super.getColor();
    }

    public String getTypeBox() {
        return typeBox;
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

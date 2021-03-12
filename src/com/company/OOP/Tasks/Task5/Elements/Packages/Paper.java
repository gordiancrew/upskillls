package com.company.OOP.Tasks.Task5.Elements.Packages;

import com.company.OOP.Tasks.Task5.Elements.Package;

import java.util.Objects;

public class Paper extends Package {
    private String typePaper;
    public Paper(String typePaper,String color,int price) {
        super(price, color);
        this.typePaper=typePaper;
    }

    @Override
    public void setPrice(int price) {
        super.setPrice(price);
    }

    public void setTypePaper(String typePaper) {
        this.typePaper = typePaper;
    }

    @Override
    public String getColor() {
        return super.getColor();
    }

    public String getTypePaper() {
        return typePaper;
    }

    @Override
    public int getPrice() {
        return super.getPrice();
    }

    @Override
    public String toString() {
        return "Paper{" +
                "typePaper=" + typePaper +
                ", color="+getColor()+
                " ,price="+getPrice()+
                "$}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Paper paper = (Paper) o;
        return typePaper == paper.typePaper;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), typePaper);
    }
}

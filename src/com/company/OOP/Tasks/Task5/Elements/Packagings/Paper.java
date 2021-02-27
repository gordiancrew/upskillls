package com.company.OOP.Tasks.Task5.Elements.Packagings;

import com.company.OOP.Tasks.Task5.Elements.Packaging;
import com.company.OOP.Tasks.Task5.Enams.Color;
import com.company.OOP.Tasks.Task5.Enams.TypePaper;

import java.util.Objects;

public class Paper extends Packaging {
    private TypePaper typePaper;
    public Paper(TypePaper typePaper,Color color,int price) {
        super(price, color);
        this.typePaper=typePaper;
    }

    public TypePaper getTypePaper() {
        return typePaper;
    }

    public void setTypePaper(TypePaper typePaper) {
        this.typePaper = typePaper;
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

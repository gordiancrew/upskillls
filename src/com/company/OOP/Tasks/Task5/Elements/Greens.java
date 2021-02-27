package com.company.OOP.Tasks.Task5.Elements;

import com.company.OOP.Tasks.Task5.Enams.Color;
import com.company.OOP.Tasks.Task5.Enams.SortGreens;

import java.util.Objects;

public class Greens extends Element {
    private SortGreens sortGreens;

    public Greens(SortGreens sortGreens, int price){
        super(price);
        this.sortGreens=sortGreens;
    }

    public SortGreens getSortGreens() {
        return sortGreens;
    }

    public void setSortGreens(SortGreens sortGreens) {
        this.sortGreens = sortGreens;
    }

    @Override
    public String toString() {
        return "Greens{" +
                "sort=" + sortGreens +
                ", price="+getPrice()+
                "$}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Greens greens = (Greens) o;
        return sortGreens == greens.sortGreens;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), sortGreens);
    }
}

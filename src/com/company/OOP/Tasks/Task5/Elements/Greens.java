package com.company.OOP.Tasks.Task5.Elements;



import java.util.Objects;

public class Greens extends Element {
    private String sortGreens;

    public Greens(String sortGreens, int price){
        super(price);
        this.sortGreens=sortGreens;
    }

    @Override
    public void setPrice(int price) {
        super.setPrice(price);
    }

    public void setSortGreens(String sortGreens) {
        this.sortGreens = sortGreens;
    }

    @Override
    public int getPrice() {
        return super.getPrice();
    }

    public String getSortGreens() {
        return sortGreens;
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

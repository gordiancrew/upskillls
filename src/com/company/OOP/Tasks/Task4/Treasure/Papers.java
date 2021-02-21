package com.company.OOP.Tasks.Task4.Treasure;

public class Papers extends Treasure {
    int numberPages;
    public Papers(String name, int price, int numberPages) {
        super(name, price);
        this.numberPages=numberPages;
    }

    public int getNumberPages() {
        return numberPages;
    }

    public void setNumberPages(int numberPages) {
        this.numberPages = numberPages;
    }

    @Override
    public String toString() {
        return "Papers{" +

                "name='" + getName() + '\'' +
                ", price=" + getPrice() +
                ", numberPages=" + getNumberPages() +
                '}';
    }
}

package com.company.classes.aggregation_and_composition.Task3;

public class Town {
    private String name;
    private int numberPeople;
    public Town(String name, int numberPeople){
      this.name=name;
      this.numberPeople=numberPeople;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setNumberPeople(int numberPeople) {
        this.numberPeople = numberPeople;
    }

    public int getNumberPeople() {
        return numberPeople;
    }

    @Override
    public String toString() {
        return "Town{" +
                "name='" + name + '\'' +
                ", numberPeople=" + numberPeople +
                '}';
    }
}

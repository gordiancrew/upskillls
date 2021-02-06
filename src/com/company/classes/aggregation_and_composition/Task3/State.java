package com.company.classes.aggregation_and_composition.Task3;

import java.util.ArrayList;

public class State {
    private String name;
    private Town capital;
    private ArrayList<Region> regions;

    public State(String name, Town capital, ArrayList<Region> regions) {
        this.capital = capital;
        this.regions = regions;
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }


    public void setCapital(Town capital) {
        this.capital = capital;
    }

    public Town getCapital() {
        return capital;
    }

    public void setRegions(ArrayList<Region> regions) {
        this.regions = regions;
    }

    public ArrayList<Region> getRegions() {
        return regions;
    }

    public void printCapital() {
        System.out.println("Capital of " + getName() + " is " + getCapital().getName());
    }

    public void printNumberRegion() {
        System.out.println("Number of region in " + getName() + " is " + getRegions().size());

    }

    public void printSquare() {
        double square = 0;
        for (Region x : regions) {
            square = square + x.getSquare();
        }
        System.out.println("Square of " + getName() + " is " + square + " m2");
    }
    public  void printRegionsCenters(){
        StringBuilder str=new StringBuilder();
        str.append("Regions centers of "+getName()+" is ");
        for (Region x : regions) {
str.append(x.getRegionCenter().getName()+", ");
        }
        System.out.println(str.toString());
    }

    @Override
    public String toString() {
        return "State{" +
                "name='" + name + '\'' +
                ", capital=" + capital +
                ", regions=" + regions +
                '}';
    }
}

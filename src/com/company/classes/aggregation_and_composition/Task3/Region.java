package com.company.classes.aggregation_and_composition.Task3;

public class Region {
    private String name;
    private Town regionCenter;
    private  double square;
    public Region(String name, Town regionCenter,double square){
        this.name=name;
        this.regionCenter=regionCenter;
        this.square=square;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setRegionCenter(Town regionCenter) {
        this.regionCenter = regionCenter;
    }

    public Town getRegionCenter() {
        return regionCenter;
    }

    public void setSquare(double square) {
        this.square = square;
    }

    public double getSquare() {
        return square;
    }

    @Override
    public String toString() {
        return "Region{" +
                "name='" + name + '\'' +
                ", regionCenter=" + regionCenter +
                ", square=" + square +
                '}';
    }
}

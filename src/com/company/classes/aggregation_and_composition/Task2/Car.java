package com.company.classes.aggregation_and_composition.Task2;

import java.util.Arrays;

public class Car {

    private  String brand;
    private String color;
    private  String number;
    private Weel[] weels=new Weel[4];
    private  Engine engine;
    public Car(){
      brand="unknow";
      color="unknow";
      number="unknow";
      engine=new Engine();
    }
    public Car(String brand,String color,String number,Weel[]weels,Engine engine){
     this.brand=brand;
     this.color=color;
     this.number= number;
     this.weels=weels;
     this.engine=engine;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getNumber() {
        return number;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setWeels(Weel[] weels) {
        this.weels = weels;
    }

    public Weel[] getWeels() {
        return weels;
    }

    public  void carGo(){
        System.out.println("CAR IS GO.");
        for(Weel x:weels)
            x.weelSpining(true);
        engine.engineRunning(true);
    }

    public  void carRefueling(){
        System.out.println("CAR REFUELING.");
        for(Weel x:weels)
            x.weelSpining(false);
        engine.engineRunning(false);
    }

    public void changeWeel(int numberWeel, Weel changer){
        System.out.println("CHANGE WEEL.");
       engine.engineRunning(false);
        System.out.println(weels[numberWeel]+" change for "+changer);
        weels[numberWeel-1]=changer;

    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", color='" + color + '\'' +
                ", number='" + number + '\'' +
                ", weels=" + Arrays.toString(weels) +
                ", engine=" + engine +
                '}';
    }
}

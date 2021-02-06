package com.company.classes.aggregation_and_composition.Task2;

public class Engine {

private String firm;
private  double volume;
private int power;
private  String type;
private boolean activ;
public Engine(){
    firm= "unknow";
  volume=0;
  power=0;
  type="unknow";
}

public Engine(String firm, double volume, int power, String type){
   this.firm=firm;
   this.volume=volume;
   this.power=power;
   this.type=type;
}

    public void setFirm(String firm) {
        this.firm = firm;
    }

    public String getFirm() {
        return firm;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public double getVolume() {
        return volume;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void  engineRunning(Boolean activ){

        System.out.println(activ?"Engine running.":"Engine static.");
    }

    @Override
    public String toString() {
        return "Engine{" +
                "firm='" + firm + '\'' +
                ", volume=" + volume +
                ", power=" + power +
                ", type='" + type + '\'' +
                '}';
    }
}

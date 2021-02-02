package com.company.classes.simple_classes.Task10;

import com.company.algoritmization.decomposition.Task5project.Array;

import java.text.SimpleDateFormat;
import java.util.*;

public class Airline {


    private String destination;
    private  int fightNumber;
    private  String aircraftType;
    private Date time;
    private ArrayList<String> weekDays;
SimpleDateFormat df=new SimpleDateFormat("HH:mm");
    public  Airline(String destination, int fightNumber, String aircraftType, Date time, ArrayList<String> weekDays){
        this.destination=destination;
        this.fightNumber=fightNumber;
        this.aircraftType=aircraftType;
        this.time=time;
        this.weekDays=weekDays;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getDestination() {
        return destination;
    }

    public void setFightNumber(int fightNumber) {
        this.fightNumber = fightNumber;
    }

    public int getFightNumber() {
        return fightNumber;
    }

    public void setAircraftType(String aircraftType) {
        this.aircraftType = aircraftType;
    }

    public String getAircraftType() {
        return aircraftType;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public Date getTime() {
        return time;
    }

    public void setWeekDays(ArrayList<String> weekDays) {
        this.weekDays = weekDays;
    }

    public ArrayList<String> getWeekDays() {
        return weekDays;
    }
   @Override
   public  String toString(){

        return "Destination-"+getDestination()+", fight number-"+fightNumber+", aircraft type-"+getAircraftType()+
                ", time- "+df.format(getTime())+", week days: "+(weekDays);
   }

}

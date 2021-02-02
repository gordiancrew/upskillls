package com.company.classes.simple_classes.Task10;

import com.company.classes.simple_classes.Task9.Book;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

public class AirlinesList {

    ArrayList<Airline> list;
    SimpleDateFormat df=new SimpleDateFormat("HH:mm");
    public AirlinesList(){
        list=new ArrayList<>();
    }

    public void setAirline(Airline airline){
        list.add(airline);
    }

    public  void printAirLinesListForDestination(String destination){
        System.out.println("AIRLINE LIST FOR DESTINATION "+destination.toUpperCase()+" :");
        for(Airline x:list){
         if(x.getDestination().equals(destination))
             System.out.println(x);
        }
    }

    public void printAirlinesForWeekDay(String weekDay){
        System.out.println("AIRLINES LIST FOR "+weekDay.toUpperCase()+" :");
        for(Airline x:list){
           if(x.getWeekDays().contains(weekDay))
               System.out.println(x);
        }
    }

    public void printAirlinesForWeekDaySinseTime(String weekDay, Date time){
        System.out.println("AIRLINES LIST FOR "+weekDay.toUpperCase()+" sinse "+df.format(time)+" :");
        for(Airline x:list){
            if(x.getWeekDays().contains(weekDay)&&x.getTime().compareTo(time)>0)
                System.out.println(x);
        }
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        for (Airline x : list) {
            str.append(x);
            str.append("\n");
        }
        return str.toString();
    }

}

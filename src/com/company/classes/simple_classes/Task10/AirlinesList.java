package com.company.classes.simple_classes.Task10;

import com.company.algoritmization.decomposition.Task5project.Array;
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

    public  ArrayList AirLinesListForDestination(String destination){
        ArrayList<Airline>airlineDestination= new ArrayList<>();
        for(int i=0;i<list.size();i++){
         if(list.get(i).getDestination().equals(destination))
             System.out.println(list.get(i));
        }
        return  airlineDestination;
    }

    public ArrayList AirlinesForWeekDay(String weekDay){
        ArrayList<Airline>airlineWeekDay=new ArrayList<>();
        for(int i=0;i<list.size();i++){
           if(list.get(i).getWeekDays().contains(weekDay))
              airlineWeekDay.add(list.get(i));
        }
        return  airlineWeekDay;
    }

    public ArrayList AirlinesForWeekDaySinseTime(String weekDay, Date time){
        ArrayList<Airline>airlineWeekdayTime=new ArrayList<>();
        for(int i=0;i<list.size();i++){
            if(list.get(i).getWeekDays().contains(weekDay)&&list.get(i).getTime().compareTo(time)>0)
               airlineWeekdayTime.add(list.get(i));
        }
        return airlineWeekdayTime;
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

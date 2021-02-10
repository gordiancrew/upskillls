package com.company.classes.simple_classes.Task4;

import com.company.algoritmization.decomposition.Task5project.Array;

import javax.xml.crypto.Data;
import java.sql.SQLOutput;
import java.text.SimpleDateFormat;
import java.util.*;

public class Train {
    private String state;
    private int number;
    private Date time;

    public Train(String state, int number, Date time) {
        this.state = state;
        this.number = number;
        this.time = time;
    }

    public int getNumber() {
        return number;
    }

    public String getState() {
        return state;
    }

    public Date getTime() {
        return time;
    }

    public static ArrayList sortNumberTrain(ArrayList<Train> list) {
       // Comparator<Train> comp = Comparator.comparing(Train -> Train.getNumber());
        Collections.sort(list, Comparator.comparing(Train::getNumber));
        return list;
    }



    public static ArrayList<Train> sortState(ArrayList<Train> list) {
        //Comparator<Train> comp = Comparator.comparing(Train -> Train.getState());
       // Comparator<Train> comp2 = Comparator.comparing(Train -> Train.getTime());
        //Comparator<Train>comp3=Comparator.comparing(Train->Train.getState(),Train->Train.getTime());

        list.sort(Train::compareTo);
        return list;
    }



    public static void printInformationForNum(int num, ArrayList<Train> list) {
        SimpleDateFormat formater = new SimpleDateFormat("HH:mm");
        for (Train x : list) {
            if (x.number == num) {
                System.out.println("Information for num: \nNumber: " + x.number + ", State is " + x.state + ", Time is " + formater.format(x.time));
            }
        }
    }

    public static void printTrain(ArrayList<Train> list) {
        SimpleDateFormat formater = new SimpleDateFormat("HH:mm");
        for (Train train : list)
            System.out.println("State=" + train.state + ", Number=" + train.number + ", Time=" + formater.format(train.time));
    }

    public  int compareTo(Train o){
        int result=this.getState().compareTo(o.getState());
        if(result==0){
            result=this.getTime().compareTo(o.getTime());
        }
        return  result;

    }
}
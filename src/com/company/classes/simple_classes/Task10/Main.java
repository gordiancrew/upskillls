package com.company.classes.simple_classes.Task10;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    //10. Создать класс Airline, спецификация которого приведена ниже. Определить конструкторы,
    // set- и get- методы и метод  toString(). Создать второй класс, агрегирующий массив типа Airline,
    // с подходящими конструкторами и методами. Задать критерии выбора данных и вывести эти данные на консоль.
    //Airline: пункт назначения, номер рейса, тип самолета, время вылета, дни недели.
    //Найти и вывести:
    //a) список рейсов для заданного пункта назначения;
    //b) список рейсов для заданного дня недели;
    //c) список рейсов для заданного дня недели, время вылета для которых больше заданного.

    public static void main(String[] args)throws ParseException {
        SimpleDateFormat df=new SimpleDateFormat("HH:mm");
        AirlinesList list1=new AirlinesList();
        list1.setAirline(new Airline("London",999888,"Boeng-737",df.parse("10:30"), new ArrayList<String>(Arrays.asList("Sunday","Monday"))));
        list1.setAirline(new Airline("London",888999,"Boeng-666",df.parse("22:00"),new ArrayList<String>(Arrays.asList("Saturday"))));
        list1.setAirline(new Airline("London",999878,"Boeng-777",df.parse("11:30"), new ArrayList<String>(Arrays.asList("Sunday","Monday"))));
   list1.printAirLinesListForDestination("London");
   list1.printAirlinesForWeekDay("Sunday");
   list1.printAirlinesForWeekDaySinseTime("Monday",df.parse("11:00"));
    }
}

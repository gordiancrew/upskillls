package com.company.classes.simple_classes.Task4;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

import static com.company.classes.simple_classes.Task4.Train.*;

public class Main {
    //4. Создайте класс Train, содержащий поля: название пункта назначения, номер поезда, время отправления.
    // Создайте данные в массив из пяти элементов типа Train, добавьте возможность сортировки элементов массива
    // по номерам поездов. Добавьте возможность вывода информации о поезде, номер которого введен пользователем.
    // Добавьте возможность сортировки массив по пункту назначения, причем поезда с одинаковыми
    // пунктами назначения должны быть упорядочены по времени отправления.

    public static void main(String[] args) throws ParseException {
        SimpleDateFormat formater = new SimpleDateFormat("HH:mm");
        ArrayList<Train> list = new ArrayList<>();
        list.add(new Train("London", 2012, formater.parse("10:10")));
        list.add(new Train("Kiev", 1998, formater.parse("17:30")));
        list.add(new Train("London", 1945, formater.parse("19:40")));
        list.add(new Train("London", 1980, formater.parse("23:00")));
        list.add(new Train("Kiev", 2013, formater.parse("10:30")));
        printTrain(list);
        sortNumberTrain(list);
        System.out.println("Sorting for number: ");
        printTrain(list);
        printInformationForNum(2012,list);
        System.out.println("Sorting for sate: ");
        sortState(list);
        printTrain(list);
    }
}

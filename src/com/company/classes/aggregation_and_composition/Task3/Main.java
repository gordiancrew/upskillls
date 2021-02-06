package com.company.classes.aggregation_and_composition.Task3;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    //3. Создать объект класса Государство, используя классы Область, Район, Город.
    // Методы: вывести на консоль столицу, количество областей, площадь, областные центры.


    public static void main(String[] args) {
        Town minsk=new Town("Minsk",1500000);
        System.out.println(minsk);
        Region minsks=new Region("Minsks",minsk,40000);
        System.out.println(minsks);
        Town brest=new Town("Brest",800000);
        Region brests=new Region("Brests",brest,39000);
        Town gomel=new Town("Gomel",700000);
        Region gomels=new Region("Gomels",gomel, 37000);
        State blr=new State("Belarus",minsk,new ArrayList<>(Arrays.asList(minsks,gomels,brests)));
        System.out.println(blr);
        blr.printCapital();
        blr.printNumberRegion();
        blr.printSquare();
        blr.printRegionsCenters();

    }
}

package com.company.basics.cycles;

import java.util.ArrayList;
import java.util.HashSet;

public class CyclesTask7 {
    //7. Даны два числа. Определить цифры, входящие в запись как первого так и второго числа.
    public static void main(String[] args) {
        numberal(3888, 48338839);
    }

    static void numberal(int a, int b) {
        HashSet<Character> listA = new HashSet<>();
        HashSet<Character> listB = new HashSet<>();
        String aStr = Integer.toString(a);
        String bStr = Integer.toString(b);
        for (int i = 0; i < aStr.length(); i++) {
            listA.add(aStr.charAt(i));
        }
        for (int i = 0; i < bStr.length(); i++) {
            listB.add(bStr.charAt(i));
        }
        System.out.print("\nSame numerals in numbers "+a+" and "+b+" is : ");
        for (Character x : listA) {
            if (listB.contains(x))
                System.out.print(x + ", ");
        }
    }
}

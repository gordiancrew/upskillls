package com.company.basics.cycles;

import java.util.ArrayList;

public class CyclesTask7 {
    //7. Даны два числа. Определить цифры, входящие в запись как первого так и второго числа.
    public static void main(String[] args) {
        numberal(3888, 48338839);
    }

    static void numberal(int a, int b) {
        System.out.print("numerals of number " + a + " is: ");
        ArrayList<Character> listA = new ArrayList<>();
        ArrayList<Character> listB = new ArrayList<>();
        String aStr = Integer.toString(a);
        String bStr = Integer.toString(b);
        for (int i = 0; i < aStr.length(); i++) {
            if (listA.contains(aStr.charAt(i))) {
                continue;
            } else {
                System.out.print(aStr.charAt(i) + ", ");
                listA.add(aStr.charAt(i));
            }
        }
        System.out.print("\nnumerals of number " + b + " is: ");
        for (int i = 0; i < bStr.length(); i++) {
            if (listB.contains(bStr.charAt(i))) {
                continue;
            } else {
                System.out.print(bStr.charAt(i) + ", ");
                listB.add(bStr.charAt(i));
            }
        }
        System.out.print("\nSame numerals in numbers is : ");
        for (int i = 0; i < listA.size(); i++) {
            for (int ii = 0; ii < listB.size(); ii++) {
                if (listA.get(i) == listB.get(ii))
                    System.out.print(listA.get(i) + ", ");
            }
        }
    }
}

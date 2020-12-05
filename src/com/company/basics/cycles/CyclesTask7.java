package com.company.basics.cycles;

public class CyclesTask7 {
    //7. Даны два числа. Определить цифры, входящие в запись как первого так и второго числа.
    public static void main(String[] args) {
        method(38, 489);
    }
    static void method(int a, int b) {
        System.out.print("numerals of number " + a + " is: ");
        String aStr = Integer.toString(a);
        String bStr = Integer.toString(b);
        for (int i = 0; i < aStr.length(); i++) {
            System.out.print(aStr.charAt(i) + ", ");
        }
        System.out.print("\nnumerals of number " + b + " is: ");
        for (int i = 0; i < bStr.length(); i++) {
            System.out.print(bStr.charAt(i) + ", ");
        }


    }


}

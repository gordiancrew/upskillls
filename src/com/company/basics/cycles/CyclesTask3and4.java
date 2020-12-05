package com.company.basics.cycles;

import java.math.BigInteger;

public class CyclesTask3and4 {
    //3. Найти сумму квадратов первых ста чисел.
    //4. Составить программу нахождения произведения квадратов первых двухсот чисел.

    public static void main(String[] args) {
        cyclesTask3();
        cyclesTask4();
    }

    public static void cyclesTask3() {
        int square100 = 0;
        for (int i = 1; i <= 100; i++) {
            square100 = square100 + i * i;
        }
        System.out.println("task3= " + square100);
    }

    public static void cyclesTask4() {

        BigInteger mult200 = BigInteger.valueOf(1);
        for (int i = 1; i <= 200; i++) {
            mult200 = mult200.multiply(BigInteger.valueOf((long) i * i));
        }
        System.out.println("task4= " + mult200);
    }
}

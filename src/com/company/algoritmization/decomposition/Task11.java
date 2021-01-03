package com.company.algoritmization.decomposition;

import java.util.Scanner;

import static java.lang.Math.max;

public class Task11 {
    //11. Написать метод(методы), определяющий, в каком из данных двух чисел больше цифр.
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Input 2 numbers: ");

        int a = scan.nextInt();
        int b = scan.nextInt();
        scan.close();
        System.out.println("Max numerals in numbber: " + maxSizeNumber(a, b));
    }

    public static int maxSizeNumber(int a, int b) {
        int val1 = Integer.toString(a).length();
        int value2 = Integer.toString(b).length();
        return max(a, b);
    }
}

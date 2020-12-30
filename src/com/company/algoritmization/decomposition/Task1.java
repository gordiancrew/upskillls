package com.company.algoritmization.decomposition;

import java.util.Scanner;

public class Task1 {
    //1. Написать метод(методы) для нахождения наибольшего общего делителя и наименьшего общего
    // кратного двух натуральных чисел: +img1;
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Input A: ");
        int a = scan.nextInt();
        System.out.println("Input B: ");
        int b = scan.nextInt();
        scan.close();
        System.out.println("Max divider = " + maxDiv(a, b));
        System.out.println("Min multiply = " + minMultiply(a, b));
    }

    public static int maxDiv(int a, int b) {
        int c = 1;
        for (int i = Math.min(a, b); i > 1; i--) {
            if (a % i == 0 && b % i == 0) {
                c = i;
                break;
            }
        }
        return c;
    }

    public static int minMultiply(int a, int b) {
        int m = (a * b) / (maxDiv(a, b));
        return m;
    }
}

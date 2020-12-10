package com.company.basics.cycles;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class CyclesTask2 {
    //2. Вычислить значения функции на отрезке [а,b] c шагом h: +image(cycles/images/taskc2)

    public static void main(String[] args) throws IOException {
        Scanner scan  = new Scanner(System.in);
        System.out.println("Input a: ");
        Double a = scan.nextDouble();
        System.out.println("Input b: ");
        Double b = scan.nextDouble();
        System.out.println("Input h: ");
        Double h =scan.nextDouble();
        scan.close();
        slover(a, b, h);
    }

    public static void slover(double a, double b, double h) {
        for (double i = a; i <= b; i += h) {
            System.out.println(("x= " + i + ", y= ") + (i > 2 ? i : -i));
        }
    }
}

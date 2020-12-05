package com.company.basics.cycles;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CyclesTask2 {
    //2. Вычислить значения функции на отрезке [а,b] c шагом h: +image(cycles/images/taskc2)


    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Input a: ");
        Double a = Double.parseDouble(br.readLine());
        System.out.println("Input b: ");
        Double b = Double.parseDouble(br.readLine());
        System.out.println("Input h: ");
        Double h = Double.parseDouble(br.readLine());
        slover(a, b, h);
    }

    public static void slover(double a, double b, double h) {

        for (double i = a; i <= b; i = i + h) {
            System.out.println(("x= " + i + ", y= ") + (i > 2 ? i : -i));
        }
    }
}

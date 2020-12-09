package com.company.basics.linearprograms;

public class LinearProgramsTask1 {
//1. Найдите  значение функции: z = ( (a – 3 ) * b / 2) + c.

    public static void main(String[] args) {
        System.out.println(colculateZ(2.20, 3.80, 8));
    }

    public static double colculateZ(double a, double b, double c) {
        return ((a - 3) * b / 2) + c;
    }
}

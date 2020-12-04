package com.company.basics.linearprograms;

public class LinearProgramsTask1 {
//1. Найдите  значение функции: z = ( (a – 3 ) * b / 2) + c.


    public static void main(String[] args) {

        linearProgramsTask1(2.20, 3.80, 8);
    }

    public static void linearProgramsTask1(double a, double b, double c) {
        double z;
        z = ((a - 3) * b / 2) + c;
        System.out.println(z);
    }

}

package com.company.basics.linearprograms;

public class LinearProgramsTask2 {


    public static void main(String[] args) {

       linearProgramsTask2(3, 4, 5);
       linearProgramsTask2(7, 9, 2);
       linearProgramsTask2(55, 1, 3);
    }

    static void linearProgramsTask2(double a, double b, double c) {

        double z = b + Math.sqrt(Math.pow(b, 2) + 4 * a * c) / 2 * a - Math.pow(a, 3) * c + Math.pow(b, -2);
        System.out.println(z);

    }


}

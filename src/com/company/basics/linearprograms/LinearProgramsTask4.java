package com.company.basics.linearprograms;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class LinearProgramsTask4 {

    public static void main(String[] args) {
        linearProgramsTask4();
    }


    static void linearProgramsTask4() {

        NumberFormat formatter = new DecimalFormat("0.000");
        double x = 777.333;
        int c = (int) x;
        double z = c * 0.001 + (x - c) * 1000;
        System.out.println(formatter.format(z));
    }

}

package com.company;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class LinearProgramsTask4 {

    NumberFormat formatter = new DecimalFormat("0.000");
    double x = 222.333;

    void linearProgramsTask4() {

        int c = (int) x;
        double z = c*0.001+(x-c)*1000;
        System.out.println(formatter.format(z));
    }

}

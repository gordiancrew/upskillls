package com.company.basics.linearprograms;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class LinearProgramsTask4 {
//4. Дано действительное число R вида nnn.ddd (три цифровых разряда в дробной и целой частях).
// Поменять местами дробную и целую части числа и вывести полученное значение числа.
    public static void main(String[] args) {
        version1(777.444);
        version2(777.444);
    }


    public static void version1(double x) {

        NumberFormat formatter = new DecimalFormat("0.000");

        int c = (int) x;
        double z = c * 0.001 + (x - c) * 1000;
        System.out.println(formatter.format(z));
    }

    public static void version2(double x) {
        String xString = Double.toString((double) x);
        int point = 0;
        for (int i = 0; i < xString.length(); i++) {
            if (xString.charAt(i) == '.')

                point = i;


        }


        xString = xString.substring(point + 1, xString.length()) + "." + xString.substring(0, point);
        double fin = Double.parseDouble(xString);

        System.out.println(fin);


    }


}

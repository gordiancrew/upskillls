package com.company.basics.linearprograms;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class LinearProgramsTask4 {
//4. Дано действительное число R вида nnn.ddd (три цифровых разряда в дробной и целой частях).
// Поменять местами дробную и целую части числа и вывести полученное значение числа.
    public static void main(String[] args) {
        System.out.println(chenger1(777.444));
        System.out.println(chenger2(777.444));
    }

    public static double chenger1(double x) {
        NumberFormat formatter = new DecimalFormat("0.000");
        int c = (int) x;
        return c * 0.001 + (x - c) * 1000;

    }

    public static double chenger2(double x) {
        String xString = Double.toString((double) x);
        int point = 0;
        for (int i = 0; i < xString.length(); i++) {
            if (xString.charAt(i) == '.')
                point = i;
        }
        xString = xString.substring(point + 1, xString.length()) + "." + xString.substring(0, point);
       return Double.parseDouble(xString);
    }
}

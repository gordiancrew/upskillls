package com.company.basics.linearprograms;

import static java.lang.Math.cos;
import static java.lang.Math.sin;
import static java.lang.StrictMath.tan;

public class LinearProgramsTask3 {
//3. Вычислить значение выражения по формуле (все переменные принимают действительные значения): +imag(task3)

    public static void main(String[] args) {
        System.out.println(computator(3, 9));
    }

    public static double computator(double x, double y) {
        return (sin(x) + cos(y)) / (cos(x) + sin(y)) * tan(x) * y;
    }
}

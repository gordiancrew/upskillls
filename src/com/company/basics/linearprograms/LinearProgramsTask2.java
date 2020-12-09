package com.company.basics.linearprograms;

import static java.lang.Math.pow;
import static java.lang.StrictMath.sqrt;

public class LinearProgramsTask2 {
//2. Вычислить значение выражения по формуле (все переменные принимают действительные значения): +image(task2)

    public static void main(String[] args) {
        System.out.println(computationZ(3, 4, 5));
    }

    static double computationZ(double a, double b, double c) {
        return b + sqrt(pow(b, 2) + 4 * a * c) / 2 * a - pow(a, 3) * c + pow(b, -2);
    }
}

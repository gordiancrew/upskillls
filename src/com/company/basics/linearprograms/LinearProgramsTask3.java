package com.company.basics.linearprograms;

public class LinearProgramsTask3 {
//3. Вычислить значение выражения по формуле (все переменные принимают действительные значения): +imag(task3)

    public static void main(String[] args) {
        System.out.println(computator(3, 9));
    }

    public static double computator(double x, double y) {
        return (Math.sin(x) + Math.cos(y)) / (Math.cos(x) + Math.sin(y)) * Math.tan(x) * y;
    }
}

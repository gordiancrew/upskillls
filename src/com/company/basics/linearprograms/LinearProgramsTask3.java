package com.company.basics.linearprograms;

public class LinearProgramsTask3 {
//3. Вычислить значение выражения по формуле (все переменные принимают действительные значения): +imag(task3)

    public static void main(String[] args) {
        linearProgramsTask3(3, 9);
    }

    public static void linearProgramsTask3(double x, double y) {
        double z;
        z = (Math.sin(x) + Math.cos(y)) / (Math.cos(x) + Math.sin(y)) * Math.tan(x) * y;
        System.out.println(z);
    }

}

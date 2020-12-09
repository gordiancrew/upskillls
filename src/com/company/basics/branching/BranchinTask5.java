package com.company.basics.branching;

public class BranchinTask5 {
    // 5. Вычислить значение функции: + image(branching/images/taskb5)

    public static void main(String[] args) {
        System.out.println( functionValue(2));
    }

    public static double functionValue(double x) {
        return  x <= 3 ? x * x - 3 * x + 9 : 1 / (Math.pow(x, 3) + 6);
    }
}

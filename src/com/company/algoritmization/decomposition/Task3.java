package com.company.algoritmization.decomposition;

import java.util.Scanner;

import static java.lang.Math.sqrt;

public class Task3 {
    //3. Вычислить площадь правильного шестиугольника со стороной а, используя метод вычисления площади треугольника.
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Input a: ");
        double a = scan.nextDouble();
        scan.close();
        System.out.println("square =" + calculatorSquareHexagon(a));
    }

    public static double calculatorSquareHexagon(double a) {
        return calculatorSquareTriangle(a) * 6;
    }

    public static double calculatorSquareTriangle(double a) {
        return (a * a * sqrt(3)) / 4;
    }
}

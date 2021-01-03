package com.company.algoritmization.decomposition;

import java.util.Scanner;

import static java.lang.Math.sqrt;

public class Task9 {
    //9. Даны числа X, Y, Z, Т — длины сторон четырехугольника.
    //Написать метод(методы) вычисления его площади, если угол между сторонами длиной X и Y— прямой.
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Input x:");
        double x = scan.nextDouble();
        System.out.println("Input y:");
        double y = scan.nextDouble();
        System.out.println("Input z:");
        double z = scan.nextDouble();
        System.out.println("Input t:");
        double t = scan.nextDouble();
        scan.close();
        System.out.println(colculateSquareQuadrangleWithRightAngle(x,y,z,t));
    }

    public static double colculateSquareQuadrangleWithRightAngle(double x, double y, double z, double t) {
        double squareXYD = colculateSquareRightTriangle(x, y);
        double d = colculateHypotenuseForTwoSides(x, y);
        double squaredZTD = colculateSquareTriangleForThreeSides(z, t, d);
        double squareQuadrangle = squareXYD + squaredZTD;
        return squareQuadrangle;
    }

    public static double colculateHypotenuseForTwoSides(double x, double y) {
        return sqrt(x * x + y * y);
    }

    public static double colculateSquareRightTriangle(double a, double b) {
        return (a * b) / 2;
    }

    public static double colculateSquareTriangleForThreeSides(double a, double b, double c) {
        double p = (a + b + c) / 2;
        return sqrt(p * (p - a) * (p - b) * (p - c));
    }
}

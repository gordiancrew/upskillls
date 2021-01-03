package com.company.algoritmization.decomposition;

import java.util.Arrays;
import java.util.Scanner;

import static java.lang.Math.sqrt;

public class Task4 {
    //4. На плоскости заданы своими координатами n точек. Написать метод(методы),
    // определяющие, между какими из пар точек самое большое расстояние. Указание.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input the number of points:");
        int n = scanner.nextInt();
        double[][] points = new double[n][2];
        for (int i = 0; i < n; i++) {
            System.out.println("Input the coordinates of the point " + (i + 1) + ",\nInput x:");
            points[i][0] = scanner.nextDouble();
            System.out.println("Input y: ");
            points[i][1] = scanner.nextDouble();
        }
        scanner.close();
        System.out.println("Points is:");
        for (double[] x : points)
            System.out.println(Arrays.toString(x));
        maxDistanceBetweenPoints(points);
    }

    public static void maxDistanceBetweenPoints(double[][] points) {
        double maxDistance = 0;
        double distance = 0;
        int point1 = 0;
        int point2 = 0;
        for (int j = 0; j < points.length; j++) {
            for (int i = 0; i < points.length; i++) {
                distance = sqrt((points[i][0] - points[j][0]) * (points[i][0] - points[j][0]) + (points[i][1] - points[j][1]) * (points[i][1] - points[j][1]));
                if (distance > maxDistance) {
                    maxDistance = distance;
                    point1 = j + 1;
                    point2 = i + 1;
                }
            }
        }
        System.out.println("Max distance between point " + point1 + " and " + point2 + " = " + maxDistance);
    }
}

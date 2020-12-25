package com.company.algoritmization.arraysOfArrays;

import java.util.Arrays;
import java.util.Scanner;

public class Task7 {
    //7. Сформировать квадратную матрицу порядка N по правилу:+img_task7

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Input the lenght of matrix(even number): ");
        int n = scan.nextInt();
        scan.close();
        System.out.println("Square matrix is: ");
        for (double[] x : createSquareMatrix(n))
            System.out.println(Arrays.toString(x));
    }

    public static double[][] createSquareMatrix(int n) {
        if (n % 2 != 0) {
            System.out.println("N is not even number!");
            System.exit(1);
        }
        double[][] a = new double[n][n];

        for (int i = 0; i < n; i++) {
            for (int j =0; j < n; j++) {
                a[i][j] = Math.sin((i*i-j*j)/n);
            }
        }
        return a;
    }


}

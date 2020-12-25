package com.company.algoritmization.arraysOfArrays;

import java.util.Scanner;

public class Task4 {
    //4. Сформировать квадратную матрицу порядка n по заданному образцу(n - четное): +img_task4;
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Input the lenght of matrix(even number): ");
        int n = scan.nextInt();
        scan.close();
        createSquareMatrix(n);
    }

    public static int[][] createSquareMatrix(int n) {
        if (n % 2 != 0) {
            System.out.println("N is not even number!");
            System.exit(1);
        }
        int[][] a = new int[n][n];
        System.out.print("Square matrix is: ");
        for (int i = 0; i < n; i++) {
            System.out.print("\n");
            if (i % 2 == 0) {
                for (int t = 0; t < n; t++) {
                    a[i][t] = t + 1;
                    System.out.print(" " + a[i][t]);
                }
            } else
                for (int t = 0; t < n; t++) {
                    a[i][t] = n - t;
                    System.out.print(" " + a[i][t]);
                }
        }
        return a;
    }
}

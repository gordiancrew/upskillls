package com.company.algoritmization.arraysOfArrays;

import java.util.Arrays;
import java.util.Scanner;


public class Task13 {
    //13. Отсотрировать стобцы матрицы по возрастанию и убыванию значений эементов.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input order number: 1-ascending ; 2 -descending");
        int order = scanner.nextInt();
        scanner.close();
        int[][] a = createMatrix(10, 10);
        sortColumn(a, order);
    }

    public static void sortColumn(int[][] a, int order) {
        System.out.println("New matrix is: ");
        for (int z = 0; z < a.length; z++) {
            for (int i = 0; i < a.length - 1; i++) {
                for (int j = 0; j < a[i].length; j++) {
                    int t = 0;
                    if ((order == 1) ? (a[i][j] > a[i + 1][j]) : (a[i][j] < a[i + 1][j])) {
                        t = a[i][j];
                        a[i][j] = a[i + 1][j];
                        a[i + 1][j] = t;
                    }
                }
            }
        }
        for (int[] x : a)
            System.out.println(Arrays.toString(x));
    }

    public static int[][] createMatrix(int n, int m) {
        int[][] a = new int[n][m];
        System.out.println("Matrix is:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = (int) (Math.random() * 10);
            }
            System.out.println(Arrays.toString(a[i]));
        }
        return a;
    }
}

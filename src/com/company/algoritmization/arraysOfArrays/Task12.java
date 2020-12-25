package com.company.algoritmization.arraysOfArrays;

import java.util.Arrays;
import java.util.Scanner;

public class Task12 {
    //12. Отсортировать строки матрицы по возрастанию и убыванию значений элементов.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input order number: 1-ascending ; 2 -descending");
        int order = scanner.nextInt();
        scanner.close();
        int[][] a = createMatrix(10, 10);
        sortLine(a, order);
    }

    public static void sortLine(int[][] a, int order) {
        System.out.println("New matrix is: ");
        for (int i = 0; i < a.length; i++) {
            for (int z = 0; z < a[i].length - 1; z++) {
                for (int j = 0; j < a[i].length - 1; j++) {
                    int t = 0;
                    if ((order == 1) ? (a[i][j] > a[i][j + 1]) : (a[i][j] < a[i][j + 1])) {
                        t = a[i][j];
                        a[i][j] = a[i][j + 1];
                        a[i][j + 1] = t;
                    }
                }
            }
            System.out.println(Arrays.toString(a[i]));
        }
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

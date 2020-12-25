package com.company.algoritmization.arraysOfArrays;

import java.util.Arrays;
import java.util.Scanner;

public class Task10 {
    //10. Найти положительные элементы главной диагонали квадратной матрицы.
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Input the lenght of matrix: ");
        int n = scan.nextInt();
        scan.close();
        printDiagonalPositive(createSquareMatrix(n));
    }

    public static void printDiagonalPositive(int[][] a) {
        System.out.println("\nPositive numbers in the diagonal of matrix is: ");
        for (int i = 0; i < a.length; i++) {
            if (a[i][i] > 0)
                System.out.print(" " + a[i][i]);
        }
    }

    public static int[][] createSquareMatrix(int n) {
        int[][] a = new int[n][n];
        System.out.println("Square matrix is: ");
        for (int i = 0; i < n; i++) {
            for (int t = 0; t < n; t++) {
                a[i][t] = (int) (-9 + Math.random() * 19);
            }
            System.out.println(Arrays.toString(a[i]));
        }
        return a;
    }
}

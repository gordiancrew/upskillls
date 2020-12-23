package com.company.algoritmization.arraysOfArrays;

import java.util.Scanner;

public class Task2 {
    //2. Дана квадратная матрица. Вывести на экран элементы, стоящие на диагонали.
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Input the lenght of matrix: ");
        int n = scan.nextInt();
        scan.close();
        printDiagonal(createSquareMatrix(n));
    }

    public static void printDiagonal(int[][] a) {
        System.out.println("\nDiagonal of matrix is: ");
        for (int i = 0; i < a.length; i++)
            System.out.print(" " + a[i][i]);
    }

    public static int[][] createSquareMatrix(int n) {
        int[][] a = new int[n][n];
        System.out.print("Square matrix is: ");
        for (int i = 0; i < n; i++) {
            System.out.print("\n");
            for (int t = 0; t < n; t++) {
                a[i][t] = (int) (-9 + Math.random() * 19);
                System.out.print(" " + a[i][t]);
            }
        }
        return a;
    }
}

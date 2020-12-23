package com.company.algoritmization.arraysOfArrays;

import java.util.Arrays;
import java.util.Scanner;

public class Task1 {
    //1. Дана матрица. Вывести на экран все нечетные столбцы, у которых первый элемент больше последнего.
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Input the numbers of lines of array: ");
        int n = scan.nextInt();
        System.out.println("Input the numbers of cells per line: ");
        int l = scan.nextInt();
        scan.close();
        int[][] a = createArray(n, l);
        printLine(a);
        printColumn(a);
    }

    public static void printLine(int[][] a) {
        System.out.println("\nOdd ines where the first elements is greater than the last: ");
        for (int i = 0; i < a.length; i += 2) {
            if (a[i][0] > a[i][a[i].length - 1])
                System.out.println(Arrays.toString(a[i]));
        }
    }

    public static void printColumn(int[][] a) {
        System.out.print("\nOdd columns where the first elements is greater than last: ");

        for (int i = 0; i < a[0].length; i += 2) {
            if (a[0][i] > a[a.length - 1][i]) {
                System.out.print("\n");
                for (int[] x : a)
                    System.out.print(" " + x[i]);
            }
        }
    }

    public static int[][] createArray(int n, int l) {
        int[][] a = new int[n][l];
        System.out.print("Array of arrays A : ");
        for (int i = 0; i < n; i++) {
            System.out.print("\n");
            for (int t = 0; t < l; t++) {
                a[i][t] = (int) (-9 + Math.random() * 19);
                System.out.print(" " + a[i][t]);
            }
        }
        return a;
    }
}

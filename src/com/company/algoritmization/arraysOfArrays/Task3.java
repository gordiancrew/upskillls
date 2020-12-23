package com.company.algoritmization.arraysOfArrays;

import java.util.Arrays;
import java.util.Scanner;

public class Task3 {
    //3. Дана матрица. Вывести k-ю строку и p-й столбец матрицы.
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Input the numbers of lines of array: ");
        int n = scan.nextInt();
        System.out.println("Input the numbers of cells per line: ");
        int l = scan.nextInt();
        System.out.println("Input K - number of line: ");
        int k = scan.nextInt();
        System.out.println("Input P-number of column: ");
        int p = scan.nextInt();
        scan.close();
        int[][] a = createMatrix(n, l);
        printLine(a, k);
        printColumn(a, p);
    }

    public static void printLine(int[][] a, int k) {
        System.out.println("\nLine K=" + k + " is: " + Arrays.toString(a[k - 1]));
    }

    public static void printColumn(int[][] a, int p) {
        System.out.print("Column P=" + p + " is: ");
        for (int[] t : a)
            System.out.print(" " + t[p - 1]);
    }

    public static int[][] createMatrix(int n, int l) {
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

package com.company.algoritmization.arraysOfArrays;

import java.util.Arrays;
import java.util.Scanner;

public class Task6 {
    //6. Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):+img_task6;
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Input the lenght of matrix(even number): ");
        int n = scan.nextInt();
        scan.close();
        System.out.println("Square matrix is: ");
        for (int[] x : createSquareMatrix(n))
            System.out.println(Arrays.toString(x));
    }

    public static int[][] createSquareMatrix(int n) {
        if (n % 2 != 0) {
            System.out.println("N is not even number!");
            System.exit(1);
        }
        int[][] a = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int t = (i < n / 2 ? i : n - i - 1); t < (i < n / 2 ? n - i : i + 1); t++) {
                a[i][t] = 1;
            }
        }
        return a;
    }
}

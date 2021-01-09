package com.company.algoritmization.arraysOfArrays;

import java.util.Arrays;
import java.util.Scanner;

public class Task5 {
    //5. Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):+img_task5
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Input the lenght of matrix(even number): ");
        int n = scan.nextInt();
        scan.close();
        System.out.println("Square matrix is: ");
       Task5 a=new Task5();
        for (int[] x : a.createSquareMatrix(n))
            System.out.println(Arrays.toString(x));
    }

    public   int[][] createSquareMatrix(int n) {
        if (n % 2 != 0) {
            System.out.println("N is not even number!");
            System.exit(1);
        }
        int[][] a = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int t = 0; t < n - i; t++) {
                a[i][t] = i + 1;
            }
        }
        return a;
    }
}

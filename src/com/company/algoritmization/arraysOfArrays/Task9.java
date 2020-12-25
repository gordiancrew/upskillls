package com.company.algoritmization.arraysOfArrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Task9 {
    //9. Задана матрица неотрицательных чисел. Посчитать сумму элементов в каждом столбце.
    // Определить, какой столбец содержит максимальную сумму.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input the lenght of matrix: ");
        int n = scanner.nextInt();
        scanner.close();
        int[][] a = createSquareMatrix(n);
        for (int[] x : a)
            System.out.println(Arrays.toString(x));
        sumLines(a);
    }

    public static void sumLines(int[][] a) {
        ArrayList<Integer> sumList = new ArrayList<>();
        for (int[] x : a) {
            int sum = 0;
            for (int i = 0; i < x.length; i++) {
                sum += x[i];
            }
            sumList.add(sum);
        }
        for (int i = 0; i < sumList.size(); i++)
            System.out.println("Sum numbers in line " + (i + 1) + " is: " + (sumList.get(i) + 1));
        int max = Collections.max(sumList);
        System.out.println("Max sum numbers in line " + (sumList.indexOf(max) + 1) + " = " + max);
    }

    public static int[][] createSquareMatrix(int n) {
        int[][] a = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = (int) (Math.random() * 10);
            }
        }
        return a;
    }
}

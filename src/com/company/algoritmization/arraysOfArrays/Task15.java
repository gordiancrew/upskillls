package com.company.algoritmization.arraysOfArrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Task15 {
    //15. Найдите наибольший элемент матрицы и заменить все нечетные элементы на него.
    public static void main(String[] args) {
        int[][] a = createMatrix(10, 12);
        int max = maxNumber(a);
        changeOddForMax(a, max);
    }

    public static int maxNumber(int[][] a) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int[] x : a) {
            for (int y : x) {
                list.add(y);
            }
        }
        System.out.println("Max number of matrix is: " + Collections.max(list));
        return Collections.max(list);
    }

    public static int[][] changeOddForMax(int[][] a, int max) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (a[i][j] % 2 != 0)
                    a[i][j] = max;
            }
        }
        for (int[] x : a)
            System.out.println(Arrays.toString(x));
        return a;
    }

    public static int[][] createMatrix(int m, int n) {
        int[][] a = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = (int) (Math.random() * 99);
            }
        }

        System.out.println("Matrix is: ");
        for (int[] x : a)
            System.out.println(Arrays.toString(x));
        return a;
    }
}

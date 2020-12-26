package com.company.algoritmization.arraysOfArrays;

import java.util.Arrays;

public class Task14 {
    //14. Сформировать случайную матрицу m x n, состоящую из нулей и единиц,
    // причем в каждом столбце число единиц равно номеру столбца.
    public static void main(String[] args) {
        createMatrix(10, 8);
    }

    public static void createMatrix(int m, int n) {
        int[][] a = new int[m][n];
        for (int j = 0; j < n; j++) {
            int count = 0;
            while (count <= j) {
                int random = (int) (Math.random() * m);
                if (a[random][j] == 0) {
                    a[random][j] = 1;
                    count++;
                }
            }
        }
        for (int[] x : a)
            System.out.println(Arrays.toString(x));
    }
}

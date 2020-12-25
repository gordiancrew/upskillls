package com.company.algoritmization.arraysOfArrays;

import java.util.Arrays;

public class Task11 {
    //11. Матрицу 10x20 заполнить случайными числами от 0 до 15.
    // Вывести на экран саму матрицу и номера строк, в которых число 5 встречается три и более раз.
    public static void main(String[] args) {
        int[][] matrix = createMatrix(10, 20);
        System.out.println("Matrix is: ");
        for (int[] x : matrix)
            System.out.println(Arrays.toString(x));
        printLineFive(matrix);
    }

    public static void printLineFive(int[][] a) {
        System.out.println("Numbers of Line where numeral 5 finde 3 or more times is: ");
        for (int i = 0; i < a.length; i++) {
            int count = 0;
            for (int j = 0; j < a[i].length; j++) {
                count = ((a[i][j] == 5) ? count + 1 : count);
            }
            if (count >= 3)
                System.out.print(i + 1 + " ");
        }
    }

    public static int[][] createMatrix(int n, int m) {
        int[][] a = new int[n][m];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 20; j++) {
                a[i][j] = (int) (Math.random() * 16);
            }
        }
        return a;
    }
}

package com.company.algoritmization.arraysOfArrays;

import java.util.Arrays;
import java.util.Scanner;

public class Task8 {
    //8. В числовой матрице поменять местами два столбца любых столбца,
    // т. е. все элементы одного столбца поставить на соответствующие им позиции другого,
    // а его элементы второго переместить в первый.
    // Номера столбцов вводит пользователь с клавиатуры.

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Input the lenght of matrix: ");
        int n = scan.nextInt();
        System.out.println("Input number first kolumn: ");
        int firstColumn = scan.nextInt();
        System.out.println("Input number second column: ");
        int secondColumn = scan.nextInt();
        scan.close();
        System.out.println("Square matrix is: ");
        int[][] a = createSquareMatrix(n);
        for (int[] x : a)
            System.out.println(Arrays.toString(x));
        System.out.println("New matrix replacing "+firstColumn+" column by "+secondColumn+" is: ");
        for (int[] x : chengeColumns(a, firstColumn, secondColumn))
            System.out.println(Arrays.toString(x));
    }

    public static int[][] chengeColumns(int[][] a, int firstColumn, int secondColumn) {
        int z = 0;
        for (int i = 0; i < a.length; i++) {
            z = a[i][firstColumn - 1];
            a[i][firstColumn - 1] = a[i][secondColumn - 1];
            a[i][secondColumn - 1] = z;
        }
        return a;
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

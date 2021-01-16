package com.company.algoritmization.arraysOfArrays;

import java.util.Scanner;

public class Task16 {
    //16. Магическим квадратом порядка n называется квадратная матрица размера nxn,
    // составленная из чисел 1, 2, 3, ..., так, что суммы по каждому столбцу,
    // каждой строке и каждой из двух больших диагоналей равны между собой.
    // Построить такой квадрат.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input n: ");
        int n = scanner.nextInt();
        scanner.close();
        printMatrix(n);
    }

    static void printMatrix(int n) {
        int[][] a = new int[n + 1][n + 1];
        System.out.println("Source matrix: ");
        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < n + 1; j++) {
                a[i][j] = 1 + ((i + j - 1 + (n - 1) / 2) % n) * n + ((i + 2 * j + 2) % n);
                if (a[i][j] < 10)
                    System.out.print(" ");
                System.out.print(" " + a[i][j]);
            }
            System.out.println();


        }


    }
}
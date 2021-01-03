package com.company.algoritmization.decomposition;

import java.util.Scanner;

public class Task8 {
    //8. Задан массив D. Определить следующие суммы: D[l] + D[2] + D[3]; D[3] + D[4] + D[5]; D[4] +D[5] +D[6].
    //Пояснение. Составить метод(методы) для вычисления суммы трех последовательно расположенных элементов массива
    // с номерами от k до m.
    public static void main(String[] args) {
        int[] a = {5, 88, 3, 22, 11, 4, 6, 7, 33, 9, 77, 5, 33, 37, 83, 25, 67, 34, 56};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input k:");
        int k = scanner.nextInt();
        System.out.println("Input m: ");
        int m = scanner.nextInt();
        if ((m - k) == 2 && k > 0 && m <= a.length) {
            System.out.println(sumThreeNumbers(a, k, m));
        } else {
            System.err.println("Incorrect input.");
        }
    }

    public static int sumThreeNumbers(int[] a, int k, int m) {
        int sum = 0;
        for (int i = k - 1; i <= m - 1; i++) {
            sum += a[i];        }
        return sum;
    }
}

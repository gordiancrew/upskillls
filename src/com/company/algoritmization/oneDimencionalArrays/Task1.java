package com.company.algoritmization.oneDimencionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class Task1 {
    //1. В массив A [N] занесены натуральные числа. Найти сумму тех элементов, которые кратны данному К.

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Input N- arrays lenght:");
        int n = scan.nextInt();
        System.out.println("Input K -divider:");
        int k = scan.nextInt();
        System.out.println("Sum of muitiply of K is : " + sumMultiplyDivider(createArray(n), k));
        scan.close();
    }

    public static int[] createArray(int n) {
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = (int) (1 + Math.random() * 99);
        }
        System.out.println("Array A= " + Arrays.toString(a));
        return a;
    }

    public static int sumMultiplyDivider(int[] a, int k) {
        int sum = 0;
        for (int x : a) {
            if (x % k == 0) {
                sum += x;
            }
        }
        return sum;
    }
}

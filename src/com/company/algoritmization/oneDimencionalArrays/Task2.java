package com.company.algoritmization.oneDimencionalArrays;

import java.util.Arrays;
import java.util.Scanner;
public class Task2 {
    //2. Дана последовательность действительных чисел а1 ,а2 ,..., ап.
    // Заменить все ее члены, большие данного Z, этим числом. Подсчитать количество замен.
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Input the lenght of the array: ");
        int n = scan.nextInt();
        int[] a = createArray(n);
        System.out.println("Input Z: ");
        int z = scan.nextInt();
        scan.close();
        changerForZ(a, z);
    }

    public static int[] createArray(int n) {
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = (int) (1 + Math.random() * 99);
        }
        System.out.println("Array A= " + Arrays.toString(a));
        return a;
    }

    public static void changerForZ(int[] a, int z) {
        int changeCount = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] > z) {
                a[i] = z;
                changeCount++;
            }
        }
        System.out.println("New Array = " + Arrays.toString(a) + "\nNumber of replacements= " + changeCount);
    }
}

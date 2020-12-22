package com.company.algoritmization.oneDimencionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class Task6 {
    //6. Задана последовательность N вещественных чисел.
    // Вычислить сумму чисел, порядковые номера которых являются простыми числами.
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Input the lenght of the array: ");
        int n = scan.nextInt();
        scan.close();
        double[] a = createArray(n);
        System.out.println("The sum of numbers whose ordinal number is a prime number = " + sumNumbersOrdinalSimle(a));
    }

    public static double sumNumbersOrdinalSimle(double[] a) {
        double sum = 0;
        for (int i = 0; i < a.length; i++) {
            if (i > 0)
                sum += a[i];
        }
        return sum;
    }

    public static double[] createArray(int n) {
        double[] a = new double[n];
        for (int i = 0; i < n; i++) {
            a[i] = Math.random() * 99;
        }
        System.out.println("Array A= " + Arrays.toString(a));
        return a;
    }
}

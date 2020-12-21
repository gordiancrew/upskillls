package com.company.algoritmization.oneDimencionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class Task3 {
    //3. Дан массив действительных чисел, размерность которого N.
    // Подсчитать, сколько в нем отрицательных, положительных и нулевых элементов.
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Input the lenght of the array: ");
        int n = scan.nextInt();
        int[] a = createArray(n);
        scan.close();
        countPositivNegativ(a);
    }

    public static void countPositivNegativ(int[] a) {
        int countPos = 0;
        int countNeg = 0;
        int countZero = 0;
        for (int x : a) {
            if (x > 0)
                countPos++;
            else if (x < 0)
                countNeg++;
            else
                countZero++;
        }
        System.out.println("Number of positive elements: " + countPos + "\nNumber of negative elements: " +
                countNeg + "\nNumber of zero elements: " + countZero);
    }

    public static int[] createArray(int n) {
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = (int) (-99 + Math.random() * 199);
        }
        System.out.println("Array A= " + Arrays.toString(a));
        return a;
    }
}

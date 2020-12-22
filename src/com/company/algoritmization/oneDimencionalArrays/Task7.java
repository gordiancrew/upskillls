package com.company.algoritmization.oneDimencionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class Task7 {
    //7. Даны действительные числа а1 ,а2 ,..., аn. Найти +imageTask7;
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Input the lenght of the array(even number): ");
        int n = scan.nextInt();
        int[] a = createArray(n);
        scan.close();
        maxPattern(a);
    }

    public static void maxPattern(int[] a) {
        int maxSum = 0;
        int index = 0;
        for (int i = 0; i < a.length / 2; i++) {
            if (a[i] + a[a.length - 1 - i] > maxSum) {
                maxSum = a[i] + a[a.length - 1 - i];
                index = i + 1;
            }
        }
        System.out.println("Max pattern: " + maxSum + "=" + "a[" + index + "]+a[2n-" + (index - 1) + "]");
    }

    public static int[] createArray(int n) {
        if (n % 2 != 0) {
            System.out.println("Is not an even number!");
            System.exit(1);
        }
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = (int) (1 + Math.random() * 99);
        }
        System.out.println("Array A= " + Arrays.toString(a));
        return a;
    }
}

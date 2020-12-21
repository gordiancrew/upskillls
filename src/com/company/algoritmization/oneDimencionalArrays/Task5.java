package com.company.algoritmization.oneDimencionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class Task5 {
    //5. Даны целые числа а1 ,а2 ,..., аn . Вывести на печать только те числа, для которых аi > i.

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Input the lenght of the array: ");
        int n = scan.nextInt();
        int[] a = createArray(n);
        scan.close();
        printMoreI(a);
    }

    public static void printMoreI(int[] a) {
        System.out.print("Numbers more i =  ");
        for (int i = 0; i < a.length; i++) {
            if (i < a[i])
                System.out.print(" " + a[i]);
        }
    }

    public static int[] createArray(int n) {
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = (int) (1 + Math.random() * 9);
        }
        System.out.println("Array A= " + Arrays.toString(a));
        return a;
    }
}

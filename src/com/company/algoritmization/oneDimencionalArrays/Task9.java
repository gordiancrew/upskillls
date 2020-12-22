package com.company.algoritmization.oneDimencionalArrays;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;

public class Task9 {
    //9. В массиве целых чисел с количеством элементов n найти наиболее часто встречающееся число.
    // Если таких чисел несколько, то определить наименьшее из них.
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Input the lenght of the sequence: ");
        int n = scan.nextInt();
        scan.close();
        findFrequentNumber(createArray(n));
    }

    public static void findFrequentNumber(int[] a) {
        int frequentNumber = 0;
        int countMax = 0;
        for (int x : a) {
            int countNumber = 0;
            for (int y : a) {
                if (x == y) {
                    countNumber++;
                }
            }
            if (countNumber > countMax) {
                countMax = countNumber;
                frequentNumber = x;
            } else if (countNumber == countMax) {
                frequentNumber = Math.min(frequentNumber, x);
            }
        }
        if (countMax == 1)
            System.out.println("No repetitions of numbers. ");
        else {
            System.out.println("Frequent number is " + frequentNumber + " repeats " + countMax + " times.");
        }
    }

    public static int[] createArray(int n) {
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = (int) (-9 + Math.random() * 19);
        }
        System.out.println("Array A : " + Arrays.toString(a));
        return a;
    }
}

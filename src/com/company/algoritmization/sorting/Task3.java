package com.company.algoritmization.sorting;

import java.util.Arrays;

public class Task3 {
    //Реализуйте сортировку обменами.
    public static void main(String[] args) {
        int[] a = {3, 7, 8, 5, 3, 2, 9, 7, 7, 3, 2, 6, 8, 6, 3,};
        System.out.println(Arrays.toString(a));
        int[] b = bubbleSort(a);
        System.out.println(Arrays.toString(b));
    }

    public static int[] bubbleSort(int[] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 1; j < a.length; j++) {
                int value = 0;
                if (a[j] < a[j-1]) {
                    value = a[j];
                    a[j] = a[j - 1];
                    a[j - 1] = value;
                }
            }
        }
        return a;
    }
}

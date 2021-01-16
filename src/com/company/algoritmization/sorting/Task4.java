package com.company.algoritmization.sorting;

import java.util.Arrays;

public class Task4 {
    //Реализуйте сортировку вставками.
    public static void main(String[] args) {
        int[] a = {3, 7, 8, 5, 3, 2, 9, 7, 7, 3, 2, 6, 8, 6, 3,};
        System.out.println(Arrays.toString(a));
        int[] b = insertionSort(a);
        System.out.println(Arrays.toString(b));
    }

    public static int[] insertionSort(int[] a) {
        int count=0;
        for (int i = 1; i < a.length; i++) {
            int value = a[i];
            int j = i - 1;
            while (j >= 0 && value < a[j]) {
                a[j + 1] = a[j];
                count++;
                j--;
            }
            a[j + 1] = value;
        }
        System.out.println(count);
        return a;
    }
}

package com.company.algoritmization.sorting;

import java.util.Arrays;


public class Task5 {
    //Реализуйте сортировк Шелла.
    public static void main(String[] args) {
        int[] a = {3, 7, 8, 5, 3, 2, 9, 7, 7, 3, 2, 6, 8, 6, 3,};
        System.out.println(Arrays.toString(a));
        int[] b = shellSort(a);
        System.out.println(Arrays.toString(b));
    }

    public static int[] shellSort(int[] a) {
        int j;
        int count=0;
        for (int gap = a.length / 2; gap > 0; gap /= 2) {
            for (int i = gap; i < a.length; i++) {
                int temp = a[i];
                for (j = i; j >= gap && a[j - gap] > temp; j -= gap) {
                    a[j] = a[j - gap];
                    count++;
                }
                a[j] = temp;
            }
        }
        System.out.println(count);
        return a;
    }
}

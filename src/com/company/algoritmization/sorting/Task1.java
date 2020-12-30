package com.company.algoritmization.sorting;

import java.util.Arrays;

public class Task1 {
    //Заданы 2 одномерных массива с различным количеством элементов и натуральное число k.Объеденить их в один массив,
    //включив второй массив между k-м и (k+1)-м элементами первого, при этом не используя дополнительный массив.
    public static void main(String[] args) {
        int[] a = {1, 3, 2, 5, 4, 2, 3, 5, 2};
        int[] b = {6, 9, 8, 7, 9, 8, 7, 8, 6, 7, 8, 7};
        int k = 4;
        uniferArrays(a, b, k);
    }

    public static void uniferArrays(int[] a, int[] b, int k) {
        int uniLength = a.length + b.length;
        int aLength = a.length;
        a = Arrays.copyOf(a, uniLength);
        for (int i = uniLength - 1; i >= k + (b.length); i--) {
            a[i] = a[i - (aLength + k)];
        }
        for (int i = 0; i < b.length; i++) {
            a[i + k] = b[i];
        }
        System.out.println(Arrays.toString(a));
    }
}

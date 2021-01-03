package com.company.algoritmization.decomposition;

import java.util.Arrays;

public class Task5 {
    //5. Составить программу, которая в массиве A[N] находит второе по величине число
    // (вывести на печать число, которое меньше максимального элемента массива, но больше всех других элементов).

    public static void main(String[] args) {
        int[] a = {2, 4, 1, 9, 1, 4, 32, 2, 9, 48, 77, 5, 44, 3,};
        System.out.println("Second max number is: " + getSecondMax(a));
    }

    public static int getSecondMax(int[] a) {
        Arrays.sort(a);
        return a[a.length - 2];
    }
}

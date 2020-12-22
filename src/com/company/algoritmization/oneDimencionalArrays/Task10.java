package com.company.algoritmization.oneDimencionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class Task10 {
    //10. Дан целочисленный массив с количеством элементов п.
    // Сжать массив, выбросив из него каждый второй элемент (освободившиеся элементы заполнить нулями).
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Input the lenght of the sequence: ");
        int n = scan.nextInt();
        scan.close();
        System.out.println("New array: " + Arrays.toString(constrictorArray(createArray(n))));
    }

    public static int[] constrictorArray(int[] a) {
        for (int i = 0; i < a.length / 2; i++) {
            a[i] = a[i + i];
        }
        for (int i = a.length / 2; i < a.length; i++) {
            a[i] = 0;
        }
        return a;
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

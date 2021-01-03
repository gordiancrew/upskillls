package com.company.algoritmization.decomposition;

import java.util.Arrays;
import java.util.Scanner;

public class Task12 {
    //12. Даны натуральные числа К и N. Написать метод(методы) формирования массива А,
    // элементами которого являются числа, сумма цифр которых равна К и которые не большее N.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input k:");
        int k = scanner.nextInt();
        System.out.println("Input n: ");
        int n = scanner.nextInt();
        scanner.close();
        if (k >= 1 && n >= 1)
            System.out.println(Arrays.toString(createArray(k, n)));
        else
            System.err.println("Incorrect input.");
    }

    public static int[] createArray(int k, int n) {
        int[] a = new int[k];
        for (int i = 0; i < k; i++)
            a[i] = 1;
        return a;
    }
}
package com.company.algoritmization.decomposition;

import java.util.Arrays;
import java.util.Scanner;

public class Task10 {
    //10. Дано натуральное число N. Написать метод(методы) для формирования массива,
    // элементами которого являются цифры числа N.
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Input n: ");
        int n = scan.nextInt();
        scan.close();
        System.out.println(Arrays.toString(arrayNumeralsOfNumber(n)));
    }

    public static int[] arrayNumeralsOfNumber(int n) {
        int size = (Integer.toString(n)).length();
        int[] a = new int[size];
        for (int i = 0; i < size; i++) {
            a[size - 1 - i] = n % 10;
            n = n / 10;
        }
        return a;
    }
}

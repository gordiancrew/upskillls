package com.company.algoritmization.decomposition;

import java.util.Scanner;

public class Task14_2 {
    //14. Натуральное число, в записи которого n цифр,
    // называется числом Армстронга, если сумма его цифр, возведенная в степень n, равна самому числу.
    // Найти все числа Армстронга от 1 до k. Для решения задачи использовать декомпозицию.
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Input k:");
        int k = scan.nextInt();
        scan.close();
        findArmstrong(k);
    }

    public static void findArmstrong(int k) {
        System.out.println("Numbers of Armstrong:");
        int count = 0;
        for (int i = 1; i <= k; i++) {
            if (sumNumeralsPownOfNumber(i) == i) {
                System.out.print(i + " ");
                count++;
            }
        }
        if (count > 0)
            System.out.println("\nQuantity of numbers of Armstrong is " + count);
        else
            System.out.println("do not");
    }

    public static int sumNumeralsPownOfNumber(int n) {
        int sum = 0;
        for (int i = 0; i < sizeNumber(n); i++) {
            sum += Math.pow(arrayNumeralsOfNumber(n)[i], sizeNumber(n));
        }
        return sum;
    }

    public static int[] arrayNumeralsOfNumber(int n) {
        int size = sizeNumber(n);
        int[] a = new int[size];
        for (int i = 0; i < size; i++) {
            a[size - 1 - i] = n % 10;
            n = n / 10;
        }
        return a;
    }

    public static int sizeNumber(int n) {
        return (Integer.toString(n)).length();
    }
}

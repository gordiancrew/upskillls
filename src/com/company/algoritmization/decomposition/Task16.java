package com.company.algoritmization.decomposition;

import java.util.Scanner;

public class Task16 {
//16. Написать программу, определяющую сумму n - значных чисел, содержащих только нечетные цифры.
// Определить также, сколько четных цифр в найденной сумме. Для решения задачи использовать декомпозицию.

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Input n:");
        int n = scan.nextInt();
        scan.close();
        sumNumbersWithOddNumerals(n);
    }

    public static void sumNumbersWithOddNumerals(int n) {
        int first = firstOddNumber(n);
        int last = lastOddNumber(n);
        int sum = 0;
        for (int i = first; i <= last; i += 2) {
            sum += i;
        }
        System.out.println("Sum= " + sum);
        System.out.println("Quantity even numerals of number " + sum + " is " + colculateEvenNumeralsOfNumber(sum));
    }

    public static int firstOddNumber(int n) {
        int f = 1;
        for (int i = 2; i <= n; i++) {
            f = f * 10 + 1;
        }
        return f;
    }

    public static int lastOddNumber(int n) {
        int l = 9;
        for (int i = 2; i <= n; i++) {
            l = l * 10 + 9;
        }
        return l;
    }

    public static int colculateEvenNumeralsOfNumber(int number) {
        int evens = 0;
        int size = Integer.toString(number).length();
        for (int i = 1; i <= size; i++) {
            if (number % 2 == 0) {
                evens++;
            }
            number /= 10;
        }
        return evens;
    }
}

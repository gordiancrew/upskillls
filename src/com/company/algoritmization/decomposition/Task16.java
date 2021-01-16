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
        int sum = 0;
        System.out.println("Numbers with odd numerals: ");
        for (int i = ((int) Math.pow(10, (n - 1))); i < (int) Math.pow(10, n); i++) {
            if (colculateEvenNumeralsOfNumber(i) == 0) {
                System.out.println(i);
                sum += i;
            }
        }
        System.out.println("Sum= "+sum);
        System.out.println("Number even numerals of sum= "+colculateEvenNumeralsOfNumber(sum));
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

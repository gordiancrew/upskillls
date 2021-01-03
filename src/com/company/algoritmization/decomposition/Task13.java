package com.company.algoritmization.decomposition;

import java.util.Scanner;

public class Task13 {
    //13. Два простых числа называются «близнецами», если они отличаются друг от друга на 2 (например, 41 и 43).
    // Найти и напечатать все пары «близнецов» из отрезка [n,2n], где n - заданное натуральное число больше 2.
    // Для решения задачи использовать декомпозицию.

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Input n>2:");
        int n = scan.nextInt();
        scan.close();
        findTwinsNumbers(n);
    }

    public static void findTwinsNumbers(int n) {
        System.out.println("Pairs of twings numbers :");
        for (int i = n; i <= 2 * n - 2; i++) {
            System.out.print(i + " - " + (i + 2) + ((i != 2 * n - 2) ? ", " : "."));
        }
    }
}

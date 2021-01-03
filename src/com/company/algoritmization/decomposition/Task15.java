package com.company.algoritmization.decomposition;

import java.util.Scanner;

public class Task15 {
    //15. Найти все натуральные n-значные числа, цифры в которых образуют строго возрастающую
    // последовательность (например, 1234, 5789). Для решения задачи использовать декомпозицию.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input n, n > 2, n < 10");
        int n = scanner.nextInt();
        scanner.close();
        printOrderNumbers(n);
    }

    public static void printOrderNumbers(int n) {
        for (int i = 1; i <=(10 - n); i++) {
            System.out.println(" ");
            for (int j = i; j < n + i; j++) {
                System.out.print(j);
            }
        }
    }
}

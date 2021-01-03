package com.company.algoritmization.decomposition;

public class Task7 {
    //7. Написать метод(методы) для вычисления суммы факториалов всех нечетных чисел от 1 до 9.
    public static void main(String[] args) {
        int n = 9;
        System.out.println(sumFactorialsOdd(n));
    }

    public static int sumFactorialsOdd(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                int m = 1;
                for (int j = 1; j <= i; j++) {
                    m *= j;
                }
                sum += m;
            }
        }
        return sum;
    }
}

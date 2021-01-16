package com.company.algoritmization.decomposition;

import java.util.Scanner;

public class Task17 {
    //17. Из заданного числа вычли сумму его цифр. Из результата вновь вычли сумму его цифр и т.д.
    // Сколько таких действий надо произвести, чтобы получился нуль? Для решения задачи использовать декомпозицию.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input n: ");
        int n = scanner.nextInt();
        scanner.close();
        System.out.println(stepMinusSumNumerals(n));
    }

    public static int stepMinusSumNumerals(int n) {
        int step = 0;
        int res = n;
        int sum = sumNumerals(n);
        while (res !=0) {
            res = res - sumNumerals(res);
            step++;
        }
        return step;
    }

    public static int sumNumerals(int n) {
        int sum = 0;
        int size = (Integer.toString(n)).length();
        for (int i = 1; i <= size; i++) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }
}

package com.company.algoritmization.oneDimencionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class Task6 {
    //6. Задана последовательность N вещественных чисел.
    // Вычислить сумму чисел, порядковые номера которых являются простыми числами.
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Input the lenght of the array: ");
        int n = scan.nextInt();
        scan.close();
        int[] a = createArray(n);
        System.out.println("The sum of numbers whose ordinal number is a prime number = " + sumNumbersOrdinalSimle(a));
    }

    public static int sumNumbersOrdinalSimle(int[] a) {
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            if (isSimple(i + 1))
                sum += a[i];
        }
        return sum;
    }

    static boolean isSimple(int index) {
        if (index < 2)
            return false;
        for (int i = index - 1; i > 1; i--) {
            if (index % i == 0)
                return false;
        }
        return true;
    }

    public static int[] createArray(int n) {
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = (int) (Math.random() * 99);
        }
        System.out.println("Array A= " + Arrays.toString(a));
        return a;
    }
}

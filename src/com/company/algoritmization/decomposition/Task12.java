package com.company.algoritmization.decomposition;

import java.util.ArrayList;
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
            System.out.println(createArray(k, n));
        else
            System.err.println("Incorrect input.");
    }

    public static ArrayList<Integer> createArray(int k, int n) {
        ArrayList<Integer> a = new ArrayList<>();
        int sum = 0;
        int random;
        while (sum < (k - n)) {
            random = (int) (1 + Math.random() * n);
            a.add(random);
            sum += random;
        }
        a.add(k - sum);
        return a;
    }
}
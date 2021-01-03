package com.company.algoritmization.decomposition;

import java.util.Scanner;

import static java.lang.Math.min;

public class Task6 {
    //6. Написать метод(методы), проверяющий, являются ли данные три числа взаимно простыми.
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Input 3 numbers");
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        scan.close();
        System.out.println(checkCoprimeNumbers(a, b, c));
    }

    public static boolean checkCoprimeNumbers(int a, int b, int c) {
        for (int i = min(min(a, b), c); i > 1; i--) {
            if (a % i == 0 && b % i == 0 && c % i == 0)
                return false;
            break;
        }
        return true;
    }
}

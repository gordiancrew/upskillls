package com.company.basics.cycles;

import java.io.IOException;
import java.util.Scanner;

public class CyclesTask1 {
    //1. Напишите программу, где пользователь вводит любое целое положительное число.
    // А программа суммирует все числа от 1 до введенного пользователем числа.

    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        System.out.println("Input number: ");
        if (scan.hasNextInt()) {
            int input = scan.nextInt();
            System.out.println(sumNumbers(input));

        } else
            System.out.println("This is not number");
        scan.close();
    }
    public static int sumNumbers(int input) {
        int sum = 0;
        for (int i = 1; i <= input; i++)
            sum += i;
      return sum;
    }
}

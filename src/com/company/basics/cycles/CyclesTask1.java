package com.company.basics.cycles;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CyclesTask1 {
    //1. Напишите программу, где пользователь вводит любое целое положительное число.
    // А программа суммирует все числа от 1 до введенного пользователем числа.

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int input = Integer.parseInt(br.readLine());
        syclesTask1(input);
    }

    public static void syclesTask1(int input) {
        int sum = 0;
        for (int i = 1; i <= input; i++)
            sum = sum + i;
        System.out.println(sum);
    }
}

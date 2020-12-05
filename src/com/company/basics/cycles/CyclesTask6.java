package com.company.basics.cycles;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CyclesTask6 {
    //6. Для каждого натурального числа в промежутке от m до n вывести все делители,
    // кроме единицы и самого числа. m и n вводятся с клавиатуры.

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Input m: ");
        int m = Integer.parseInt(br.readLine());
        System.out.println("Input n: ");
        int n = Integer.parseInt(br.readLine());
        solver(m, n);
    }

    public static void solver(int m, int n) {
        for (int i = m; i <= n; i++) {
            int div = 0;
            System.out.print("\n For number " + i + " devided is: ");
            for (int ii = 2; ii < i; ii++) {
                if (i % ii == 0) {
                    System.out.print(ii + ",");
                    div++;
                }
            }
            if (div == 0)
                System.out.print("not");
        }
    }
}

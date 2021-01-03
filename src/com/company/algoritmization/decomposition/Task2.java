package com.company.algoritmization.decomposition;

import java.util.Scanner;

import static com.company.algoritmization.decomposition.Task1.maxDiv;
import static java.lang.Math.min;

public class Task2 {
    //2. Написать метод(методы) для нахождения наибольшего общего делителя четырех натуральных чисел.
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Input 4 numbers: ");
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        int d = scan.nextInt();
        scan.close();
        System.out.println("max divided is " + findMaxDivFour(a, b, c, d));
        System.out.println("max divided var2 is:"+findMaxDivFourVar2(a,b,c,d));
    }

    public static int findMaxDivFour(int a, int b, int c, int d) {
        int m = 1;
        for (int i = min(min(a, b), min(c, d)); i > 1; i--) {
            if (a % i == 0 && b % i == 0 && c % i == 0 && d % i == 0) {
                m = i;
                break;
            }
        }
        return m;
    }

    public static  int findMaxDivFourVar2(int a,int b, int c, int d){
        return maxDiv(maxDiv(a,b),maxDiv(c,d));
    }
}

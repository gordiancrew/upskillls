package com.company.algoritmization.oneDimencionalArrays;

import java.util.*;

public class Task4 {
    //4. Даны действительные числа а1 ,а2 ,..., аn . Поменять местами наибольший и наименьший элементы.
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Input the lenght of the array: ");
        int n = scan.nextInt();
        ArrayList<Integer> a = createArray(n);
        scan.close();
        System.out.println("New Array= " + changerMaxMin(a));

    }

    public static ArrayList<Integer> changerMaxMin(ArrayList<Integer> a) {
        int max = a.indexOf(Collections.max(a));
        int min = a.indexOf(Collections.min(a));
        Collections.swap(a, min, max);
        return a;
    }

    public static ArrayList<Integer> createArray(int n) {
        ArrayList<Integer> a = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            a.add((int) (1 + Math.random() * 98));
        }
        System.out.println("Array A= " + a);
        return a;
    }
}

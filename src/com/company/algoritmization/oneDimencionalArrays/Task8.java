package com.company.algoritmization.oneDimencionalArrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Task8 {
    //8. Дана последовательность целых чисел а1 ,а2 ,..., аn.
    // Образовать новую последовательность, выбросив из исходной те члены, которые равны min(а1 ,а2 ,..., аn).
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Input the lenght of the sequence: ");
        int n = scan.nextInt();
        scan.close();
        System.out.println("New sequence of numbers: " + sequenceWithoutMin(creatSequence(n)));
    }

    public static ArrayList<Integer> sequenceWithoutMin(ArrayList<Integer> a) {
        int m = Collections.min(a);
        while (a.contains(m))
            a.remove(Collections.min(a));
        return a;
    }

    public static ArrayList<Integer> creatSequence(int n) {
        ArrayList<Integer> a = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            a.add((int) (-99 + Math.random() * 199));
        }
        System.out.println("Sequence of numbers:     " + a);
        return a;
    }
}

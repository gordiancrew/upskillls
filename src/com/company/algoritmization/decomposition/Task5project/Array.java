package com.company.algoritmization.decomposition.Task5project;

import java.util.Arrays;

public class Array {
    private int[] a;

    public void setArray(int[] a) {
        this.a = a;
    }

    public void PrintSecondMax() {
        System.out.println("Second max number is: " + getSecondMax(a));
    }

    private int getSecondMax(int[] a) {
        Arrays.sort(a);
        return a[a.length - 2];
    }
}

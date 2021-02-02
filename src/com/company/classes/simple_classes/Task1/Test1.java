package com.company.classes.simple_classes.Task1;

public class Test1 {
    private int a = 3;
    private int b = 6;

    public void printAB() {
        System.out.println("a= " + a + ", b=" + b);
    }

    public void changeAB() {
        a = a + b;
        b = a - b;
        a = a - b;
    }

    public int sumAB() {
        return a + b;
    }

    public int maxAB() {
        return Math.max(a, b);
    }

}

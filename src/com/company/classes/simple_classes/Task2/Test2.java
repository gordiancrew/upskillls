package com.company.classes.simple_classes.Task2;

public class Test2 {
    private int a;
    private int b;

    public Test2() {
        a = 2;
        b = 4;
    }

    public Test2(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public void printAB() {
        System.out.println("a= " + a + ", b=" + b);
    }
}

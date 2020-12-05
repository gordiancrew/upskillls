package com.company.basics.branching;

public class BranchingTask2 {
    //2. Найти max{min(a, b), min(c, d)}.


    public static void main(String[] args) {
        branchingTask2(4, 5, 6, 7);
    }

    public static void branchingTask2(int a, int b, int c, int d) {
        System.out.println(Math.max(Math.min(a, b), Math.min(c, d)));


    }
}

package com.company.basics.branching;

import static java.lang.Math.min;
import static java.lang.Math.max;

public class BranchingTask2 {
    //2. Найти max{min(a, b), min(c, d).

    public static void main(String[] args) {
        System.out.println(findNum(4, 5, 6, 7));
    }

    public static int findNum(int a, int b, int c, int d) {
        return (max(min(a, b), min(c, d)));
    }
}

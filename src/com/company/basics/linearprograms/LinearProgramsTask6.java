package com.company.basics.linearprograms;

public class LinearProgramsTask6 {
//6. Для данной области составить линейную программу,
// которая печатает true, если точка с координатами (х, у) принадлежит закрашенной области,
// и false — в противном случае: +image(task6)
    public static void main(String[] args) {
        version1(1, 1);
    }

    public static void version1(int x, int y) {
        System.out.println(x != 0 && y != 0 && ((y > 0 && y < 5 && x < 5 && x > -5) || (y < 0 && y > -4 && x < 3 && x > -3)));
    }
}

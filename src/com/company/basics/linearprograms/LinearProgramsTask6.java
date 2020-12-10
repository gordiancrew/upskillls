package com.company.basics.linearprograms;

public class LinearProgramsTask6 {
    //6. Для данной области составить линейную программу,
// которая печатает true, если точка с координатами (х, у) принадлежит закрашенной области,
// и false — в противном случае: +image(task6)
    public static void main(String[] args) {
        System.out.println(pointZone1(1, 11));
        System.out.println(pointZone2(1, 11));
    }

    public static boolean pointZone1(int x, int y) {
        return ((y >= 0 && y <= 4 && x <= 4 && x >= -4) || (y <= 0 && y >= -3 && x <= 2 && x >= -2));
    }

    public static boolean pointZone2(int x, int y) {
        if ((x <= 4 && x >= -4) && (y <= 0 && y >= -3))
            return true;
        else if ((x <= 2 && x >= -2) && (y >= 0 && y <= 4))
            return true;
        else
            return false;
    }
}

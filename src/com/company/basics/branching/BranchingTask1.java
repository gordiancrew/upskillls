package com.company.basics.branching;

public class BranchingTask1 {
    //1. Даны два угла треугольника (в градусах).
    // Определить, существует ли такой треугольник, и если да, то будет ли он прямоугольным.


    public static void main(String[] args) {
        triangleTester1(30, 90);
        triangleTester2(30, 48);
    }

    public static void triangleTester1(int angle1, int angle2) {
        System.out.println(angle1 > 0 && angle2 > 0 && (angle1 + angle2) < 180 ? "triangle exists, " + (angle1 == 90 || angle2 == 90 || angle2 + angle1 == 90 ? " rectangular triangle" : "triangle does not rectangular  ") : "triangle does not exist");
    }

    public static void triangleTester2(int angle1, int angle2) {
        if ((angle1 > 0 && angle2 > 0) && ((angle1 + angle2) < 180)) {
            System.out.print("Triangle exists, ");
            if (angle1 == 90 || angle2 == 90 || angle1 + angle2 == 90)
                System.out.println("and it is rectangular triangle");
            else
                System.out.println("and it's not rectangular triangle");
        } else
            System.out.println("Triangle does not exists");
    }
}

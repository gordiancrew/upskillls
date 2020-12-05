package com.company.basics.branching;

public class BranchingTask1 {
    //1. Даны два угла треугольника (в градусах).
    // Определить, существует ли такой треугольник, и если да, то будет ли он прямоугольным.


    public static void main(String[] args) {
        branchingTask1(30, 90);
    }

    public static void branchingTask1(int angle1, int angle2) {
        System.out.println(angle1 > 0 && angle2 > 0 && (angle1 + angle2) < 180 ? "triangle exist, " + (angle1 == 90 || angle2 == 90 || angle2 + angle1 == 90 ? " rectangular triangle" : "triangle does not rectangular  ") : "triangle does not exist");
    }


}

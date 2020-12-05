package com.company.basics.branching;

public class BranchingTask4 {
    //4. Заданы размеры А, В прямоугольного отверстия и размеры х, у, z кирпича.
    // Определить, пройдет ли кирпич через отверстие.

    public static void main(String[] args) {
        branchingTask4(5, 7, 4, 6, 8);
    }

    public static void branchingTask4(int a, int b, int x, int y, int z) {
        int brick1 = Math.min(Math.min(x, y), z);//находим длину минимальной стороны кирпича
        int brick2;// длина средней стороны кирпича
        if (x >= y && x <= z)
            brick2 = x;
        else if (y >= x && y <= z)
            brick2 = y;
        else
            brick2 = z;
        System.out.println(brick1 <= Math.min(a, b) && brick2 <= Math.max(a, b) ? "Brick is enter" : "Brick don't enter");
    }
}

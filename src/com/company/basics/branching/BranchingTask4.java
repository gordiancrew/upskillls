package com.company.basics.branching;

import static java.lang.Math.min;

public class BranchingTask4 {
    //4. Заданы размеры А, В прямоугольного отверстия и размеры х, у, z кирпича.
    // Определить, пройдет ли кирпич через отверстие.

    public static void main(String[] args) {
        System.out.println( brickEnter(5, 7, 4, 6, 8)?"Brick is enter" : "Brick don't enter");
    }

    public static boolean brickEnter(int a, int b, int x, int y, int z) {
        int brick1 = min(min(x, y), z);//находим длину минимальной стороны кирпича
        int brick2;// длина средней стороны кирпича
        if (x >= y && x <= z)
            brick2 = x;
        else if (y >= x && y <= z)
            brick2 = y;
        else
            brick2 = z;
        return (brick1 <= min(a, b) && brick2 <= Math.max(a, b));
    }
}

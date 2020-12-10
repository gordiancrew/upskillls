package com.company.basics.branching;

public class BranchingTask3 {
    //3. Даны три точки А(х1,у1), В(х2,у2) и С(х3,у3). Определить, будут ли они расположены на одной прямой.
    public static void main(String[] args) {
        System.out.println(lineTest(1, 1, 2, 2, 3, 3) ? "points on one straight line. " : "points not on one straight line.");
    }

    public static boolean lineTest(int x1, int y1, int x2, int y2, int x3, int y3) {
        return ((y1 - y2) * x3 + (x2 - x1) * y3 + (x1 * y2 - x2 * y1) == 0);
    }
}

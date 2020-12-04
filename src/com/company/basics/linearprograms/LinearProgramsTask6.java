package com.company.basics.linearprograms;

public class LinearProgramsTask6 {
    int x = -3;
    int y = 1;
    int[][] pole = new int[14][11];


    void linearProgramsTask6() {
        for (int i = 0; i < 8; i++) {
            for (int ii = 0; ii < 3; ii++) {
                pole[i + 2][ii + 1] = 1;
            }
        }
        for (int i = 0; i < 4; i++) {
            for (int ii = 0; ii < 4; ii++) {
                pole[i + 5][ii + 5] = 1;
            }
        }

        System.out.println(pole[x + 6][x + 4] == 1);
    }
}

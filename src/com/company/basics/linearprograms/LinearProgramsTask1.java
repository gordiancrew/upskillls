package com.company.basics.linearprograms;

public class LinearProgramsTask1 {
//Найдите значение функции
    static double a = 2.20;
    static double b = 3;
    static double c = 22;
    static double z;

    public static void main(String[] args) {
      linearProgramsTask1();
    }
   public static void linearProgramsTask1() {

        z = ((a - 3) * b / 2) + c;
        System.out.println(z);
    }

}

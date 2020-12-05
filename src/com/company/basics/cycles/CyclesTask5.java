package com.company.basics.cycles;

public class CyclesTask5 {
    //5. Вывести на экран соответствий между символами и их численными обозначениями в памяти компьютера.
    public static void main(String[] args)  {
        cyclesTask5();
    }

    public static void cyclesTask5() {
        for (int i = 48; i <= 126; i++) {
            System.out.println("charNum= " + i + ", char= " + (char) i);
        }
    }
}


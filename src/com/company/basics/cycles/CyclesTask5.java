package com.company.basics.cycles;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CyclesTask5 {
    //5. Вывести на экран соответствий между символами и их численными обозначениями в памяти компьютера.
    public static void main(String[] args) throws IOException {
        //cyclesTask5();
        version2();
    }

    public static void cyclesTask5() {

        for (int i = 0; i <= 9; i++) {
            String str = Integer.toString(i);
            char ch = str.charAt(0);
            System.out.println("num= " + i + ", charNum= " + (int) ch);
        }
    }

    public static void version2()
    {
      char[] ch1=new char[60];
        for(int i=1; i<58 ;i++){
            String ss=Integer.toString(i);
            System.out.println(ss);

    }


    }
}

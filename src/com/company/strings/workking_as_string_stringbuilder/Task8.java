package com.company.strings.workking_as_string_stringbuilder;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Task8 {
    //8. Вводится строка слов, разделенных пробелами. Найти самое длинное слово и вывести его на экран.
    // Случай, когда самых длинных слов может быть несколько, не обрабатывать.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input text: ");
        String a = scanner.nextLine();
        scanner.close();
       PrintLongestWord(a);
    }

    static void PrintLongestWord(String a){
        String longestWord=" -";
        int longWord=0;
        int maxLong=0;
        int indexFirst=0;
        int indexSecond=-1;
        for(int i=0; i<a.length(); i++){
            if(a.charAt(i)==' '||i==a.length()-1){
                indexFirst=indexSecond+1;
                indexSecond=(a.charAt(i)==' ')?i:i+1;
                longWord=(a.substring(indexFirst,indexSecond)).length();
                if(longWord>maxLong){
                    maxLong=longWord;
                    longestWord=a.substring(indexFirst,indexSecond);
                }
            }
        }
        System.out.println("Max word is: "+ longestWord+ "\nlenght is : "+maxLong+" letters.");
    }
}

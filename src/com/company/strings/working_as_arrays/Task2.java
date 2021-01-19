package com.company.strings.working_as_arrays;

import java.util.Scanner;

public class Task2 {
    //2. Замените в строке все вхождения 'word' на 'letter'.
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Input text: ");
        String input = scan.nextLine();
        System.out.println("Input word to change: ");
        String wordCange = scan.nextLine();
        System.out.println("Input word to change to: ");
        String changer = scan.nextLine();
        scan.close();
        System.out.println(changeWordForLetter(input, wordCange, changer));

    }

    public static String changeWordForLetter(String input, String wordChange, String wordChanger) {
        String chenger = input.replace(wordChange, wordChanger);
        return chenger;
    }
}

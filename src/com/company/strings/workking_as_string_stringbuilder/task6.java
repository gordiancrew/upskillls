package com.company.strings.workking_as_string_stringbuilder;

import java.util.Scanner;

public class task6 {
    //6. Из заданной строки получить новую, повторив каждый символ дважды.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input text:");
        String input = scanner.nextLine();
        scanner.close();
        System.out.println(doubleLetters(input));
    }

    static String doubleLetters(String input) {
        StringBuilder str = new StringBuilder(input);
        for (int i = 0; i < str.length(); i++) {
            str.insert(i, str.charAt(i));
            i++;
        }
        return str.toString();
    }
}

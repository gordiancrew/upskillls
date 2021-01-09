package com.company.strings.workking_as_string_stringbuilder;

import java.util.Scanner;

public class Task2 {
    //2. В строке вставить после каждого символа 'a' символ 'b'.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input text: ");
        String input = scanner.nextLine();
        scanner.close();
        System.out.println(inseartB(input));
    }

    static String inseartB(String input) {
        StringBuilder str = new StringBuilder(input);
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a') {
                str.insert(i + 1, 'b');
                i++;
            }
        }
        return str.toString();
    }
}

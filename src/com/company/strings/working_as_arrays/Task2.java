package com.company.strings.working_as_arrays;

import java.util.Scanner;

public class Task2 {
    //2. Замените в строке все вхождения 'word' на 'letter'.
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Input text: ");
        String input = scan.nextLine();
        scan.close();
        System.out.println(changeWordForLetter(input));
    }

    public static String changeWordForLetter(String input) {
        StringBuilder str = new StringBuilder(input);
        for (int i = 0; i <= str.length() - 4; i++) {
            if (str.substring(i, i + 4).equals("word")) {
                str.delete(i, i + 4);
                str.insert(i, "letter");
            }
        }
        return str.toString();
    }
}

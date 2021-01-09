package com.company.strings.workking_as_string_stringbuilder;

import java.util.Scanner;

public class Task1 {
    //1. Дан текст (строка). Найдите наибольшее количество подряд идущих пробелов в нем.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input text: ");
        String input = scanner.nextLine();
        scanner.close();
        System.out.println(numberSpacesRow(input));
    }

    static int numberSpacesRow(String input) {
        int countSpaces = 0;
        int count = 0;
        for (int i = 1; i < input.length(); i++) {
            if (input.charAt(i) == ' ') {
                count++;
                if (count > countSpaces) {
                    countSpaces = count;
                }
            } else {
                count = 0;
            }
        }
        return countSpaces;
    }
}

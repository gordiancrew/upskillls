package com.company.strings.workking_as_string_stringbuilder;

import java.util.Scanner;

public class Task3 {
    //3. Проверить, является ли заданное слово палиндромом.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input word: ");
        String input = scanner.nextLine();
        scanner.close();
        System.out.println(isPalindrome(input));
    }

    static boolean isPalindrome(String input) {
        for (int i = 0; i < input.length() / 2; i++) {
            if (input.charAt(i) != input.charAt(input.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}

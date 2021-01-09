package com.company.strings.working_as_arrays;

import java.util.Scanner;

public class Task5 {
    //5. Удалить в строке все лишние пробелы, то есть серии подряд идущих пробелов заменить на одиночные пробелы.
    // Крайние пробелы в строке удалить.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input text: ");
        String input = scanner.nextLine();
        scanner.close();
        Task5 a = new Task5();
        System.out.println(a.remExtraSpace(input));
    }

    String remExtraSpace(String input) {
        String a = input.trim();
        StringBuilder str = new StringBuilder(a);
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == ' ' && str.charAt(i - 1) == ' ') {
                str.deleteCharAt(i);
                i--;
            }
        }
        return str.toString();
    }
}

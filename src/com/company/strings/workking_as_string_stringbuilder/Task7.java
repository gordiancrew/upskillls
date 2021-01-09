package com.company.strings.workking_as_string_stringbuilder;

import java.util.HashSet;
import java.util.Scanner;

public class Task7 {
    //7. Вводится строка. Требуется удалить из нее повторяющиеся символы и все пробелы.
    // Например, если было введено "abc cde def", то должно быть выведено "abcdef".
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input text: ");
        String input = scanner.nextLine();
        scanner.close();
        System.out.println(cleanerRepeads(input));

    }

    static String cleanerRepeads(String input) {
        HashSet<Character> set = new HashSet<>();
        set.add(' ');
        StringBuilder str = new StringBuilder(input);
        for (int i = 0; i < str.length(); i++) {
            if (set.contains(str.charAt(i))) {
                str.deleteCharAt(i);
                i--;
            } else {
                set.add(str.charAt(i));
            }
        }
        return str.toString();
    }
}

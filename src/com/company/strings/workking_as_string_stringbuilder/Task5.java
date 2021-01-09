package com.company.strings.workking_as_string_stringbuilder;

import java.util.Scanner;

public class Task5 {
    //5. Подсчитать, сколько раз среди символов заданной строки встречается буква “а”.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input text");
        String input = scanner.nextLine();
        scanner.close();
        System.out.println(countA(input));
    }

    static int countA(String input) {
        int count = 0;
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == 'a')
                count++;
        }
        return count;
    }
}

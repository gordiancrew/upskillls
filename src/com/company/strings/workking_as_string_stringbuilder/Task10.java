package com.company.strings.workking_as_string_stringbuilder;

import java.util.Scanner;

public class Task10 {
    //10. Строка X состоит из нескольких предложений, каждое из которых кончается точкой,
    // восклицательным или вопросительным знаком. Определить количество предложений в строке X.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input text: ");
        String a = scanner.nextLine();
        scanner.close();
        System.out.println("Number of sentences is : " + countSentences(a));
    }

    static int countSentences(String a) {
        int count = 0;
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) == '.' || a.charAt(i) == '!' || a.charAt(i) == '?') {
                count++;
            }
        }
        return count;
    }
}

package com.company.strings.workking_as_string_stringbuilder;

import java.util.Scanner;

public class Task9 {
    //9. Посчитать количество строчных (маленьких) и прописных (больших) букв в введенной строке. Учитывать только английские буквы.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input text: ");
        String a = scanner.nextLine();
        scanner.close();
        countCaseLetters(a);
    }

    static void countCaseLetters(String a) {
        int countUpper = 0;
        int countLow = 0;
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) >= 'a' && a.charAt(i) <= 'z')
                countLow++;
            else if (a.charAt(i) >= 'A' && a.charAt(i) <= 'Z')
                countUpper++;
        }
        System.out.println("Number of uppercase letters is:  " + countUpper + "\nNumbers of lowercase is: " + countLow);
    }
}

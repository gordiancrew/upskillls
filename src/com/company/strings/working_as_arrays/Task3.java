package com.company.strings.working_as_arrays;

import java.util.Scanner;

public class Task3 {
    //3. В строке найти количество цифр.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input text: ");
        String input = scanner.nextLine();
        scanner.close();
        Task3 a = new Task3();
        System.out.println("Number of digits is: " + a.countDigits(input));
    }

    int countDigits(String input) {
        int count = 0;
        for (int i = 0; i < input.length(); i++) {
            if (Character.isDigit(input.charAt(i))) {
                count++;
            }
        }
        return count;
    }
}

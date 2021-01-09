package com.company.strings.working_as_arrays;

import java.util.Scanner;

public class Task4 {
    //4. В строке найти количество чисел.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input text : ");
        String input = scanner.nextLine();
        scanner.close();
        Task4 a = new Task4();
        System.out.println("Number of numbers is: " + a.countNumbers(input));
    }

    int countNumbers(String input){
        int count=0;
        for(int i=0; i<input.length()-1;i++){
            if (Character.isDigit(input.charAt(i))&&(Character.isDigit(input.charAt(i+1))==false)){
                count++;
            }
        }
        if(Character.isDigit(input.charAt(input.length()-1)))
            count++;
        return  count;
    }
}

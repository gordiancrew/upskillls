package com.company.strings.workking_as_string_stringbuilder;

public class Task4 {
    //4. С помощью функции копирования и операции конкатенации составить из частей слова “информатика” слово “торт”.
    public static void main(String[] args) {
        String a="информатика";
        System.out.println(a.substring(7,8)+a.substring(3,5)+a.substring(7,8));
    }
}

package com.company.strings.working_as_arrays;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.SortedMap;

public class Task1 {
//1. Дан массив названий переменных в camelCase. Преобразовать названия в snake_case.

    public static void main(String[] args) {
        String[] a = {"ladaPrioraSedan", "volkswagenGolf", "renaultMeganeUniversal","kiaRio"};
        String[] b = formaterToCamelCase(a);
        System.out.println(Arrays.toString(b));
    }

    public static String[] formaterToCamelCase(String[] a) {
        for (int i = 0; i < a.length; i++) {
            StringBuilder str = new StringBuilder(a[i]);
            for (int j = 0; j < str.length(); j++) {
                if (Character.isUpperCase(str.charAt(j))) {
                    str.setCharAt(j, Character.toLowerCase(str.charAt(j)));
                    str.insert(j, '_');
                }
            }
            a[i] = String.valueOf(str);
        }
        return a;
    }
}

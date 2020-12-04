package com.company.basics.linearprograms;

import java.text.DateFormatSymbols;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

public class LinearProgramsTask5 {
//5. Дано натуральное число Т, которое представляет длительность прошедшего времени в секундах.
// Вывести данное значение длительности в часах, минутах и секундах в следующей форме:
//ННч ММмин SSc.

    public static void main(String[] args) {
        version1(2000000);
        version2(2000000);
    }

    static void version1(long t) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH mm ss");
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
        Date date = new Date(t * 1000);
        System.out.println(simpleDateFormat.format(date));
    }

    static void version2(long t) {


        System.out.println(t / (60 * 60) % 24 + " " + t / 60 % 60 + " " + t % 60);


    }
}

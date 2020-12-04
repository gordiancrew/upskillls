package com.company.basics.linearprograms;

import java.text.DateFormatSymbols;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

public class LinearProgramsTask5 {
   long t=20000000;
    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH mm ss");


    void linearProgramsTask5()
    {
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
        Date date=new Date(t*1000);
        System.out.println(date);
        System.out.println(simpleDateFormat.format(date));
    }
}

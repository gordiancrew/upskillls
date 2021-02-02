package com.company.classes.simple_classes.Task6;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

public class Timer {
    Calendar calendar;
    DateFormat format = new SimpleDateFormat("HH:mm:ss");

    public void printTimer() {
        System.out.println(format.format(calendar.getTime()));
    }

    public Timer() {
        calendar = new GregorianCalendar();
    }

    public Timer(int hour, int min, int sec) {
        calendar = new GregorianCalendar();
        calendar.set(Calendar.HOUR, hour);
        calendar.set(Calendar.MINUTE, min);
        calendar.set(Calendar.SECOND, sec);
    }

    public void setHour(int hour) {
        if (hour > 23 || hour < 0)
            hour = 0;
        calendar.set(Calendar.HOUR, hour);
    }

    public void setMinutes(int min) {
        if (min > 59 || min < 0)
            min = 0;
        calendar.set(Calendar.MINUTE, min);
    }

    public void setSeconds(int sec) {
        if (sec > 59 || sec < 0)
            sec = 0;
        calendar.set(Calendar.SECOND, sec);
    }

    public void rollHour(int rollHour) {
        calendar.roll(Calendar.HOUR, rollHour);
    }

    public void rollSeconds(int rollSec) {
        calendar.roll(Calendar.HOUR, rollSec);
    }

    public void rollMinutes(int rollMin) {
        calendar.roll(Calendar.MINUTE, rollMin);
    }
}

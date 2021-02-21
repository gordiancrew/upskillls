package com.company.OOP.Tasks.Task3;

import java.util.ArrayList;

public class Calendar {
    private int year;
    private ArrayList<HolydayDay> holydays;

    public Calendar(int year) {
        this.year = year;
        holydays = new ArrayList<>();
    }

    public void addHolydayDay(int day, int month, String event) {
        HolydayDay holydayDay = new HolydayDay(day, month, event);
        holydays.add(holydayDay);
    }

    public void printHolydayDays() {
        System.out.println("Holyday days on " + year + " year");
        for (HolydayDay x : holydays) {
            System.out.println((x.getDay() < 10 ? "0" : "") + x.getDay() + (x.getMonth() < 10 ? ".0" : ".") + x.getMonth() + " - " + x.getEvent());
        }
    }

    private class HolydayDay {
        private int day;
        private int month;
        private String event;

        public HolydayDay(int day, int month, String event) {
            this.day = day;
            this.month = month;
            this.event = event;
        }

        public int getDay() {
            return day;
        }

        public int getMonth() {
            return month;
        }

        public String getEvent() {
            return event;
        }
    }
}

package com.company.classes.simple_classes.Task6;

public class Timer2 {
    private int hours;
    private int minutes;
    private int seconds;

    public Timer2() {
        hours = 0;
        minutes = 0;
        seconds = 0;
    }

    public Timer2(int hours, int minutes, int seconds) {
        this.hours = hours;
        if (hours < 0 || hours > 23)
            this.hours = 0;
        this.minutes = minutes;
        if (minutes < 0 || minutes > 59)
            this.minutes = 0;
        this.seconds = seconds;
        if (seconds < 0 || seconds > 59)
            this.seconds = 0;
    }

    public void setHours(int hours) {
        this.hours = hours;
        if (hours < 0 || hours > 23)
            this.hours = 0;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
        if (minutes < 0 || minutes > 59)
            this.minutes = 0;
    }

    public void setSeconds(int seconds) {
        this.seconds = seconds;
        if (seconds < 0 || seconds > 59)
            this.seconds = 0;
    }

    public int getHours() {

        return hours;
    }

    public int getMinutes() {
        return minutes;
    }

    public int getSeconds() {
        return seconds;
    }
    public void rollHours(int h){
        hours+=h;
        if(hours>23) {
            hours += hours % 24;
        }
    }

    public  void  rollMinutes(int m){
        minutes+=m;
        if(minutes>59) {
            rollHours(minutes / 60);
            minutes = minutes % 60;
        }
    }

    public void rollSeconds(int s){
        seconds+=s;
        if(seconds>59){
            rollMinutes(seconds/60);
            seconds=seconds%60;
        }
    }

    @Override
    public String toString() {
        return "TIME IS- "+(getHours()<10?"0":"")+getHours()+":"+(getMinutes()<10?"0":"")+getMinutes()+":"+(getSeconds()<10?"0":"")+getSeconds();
    }
}

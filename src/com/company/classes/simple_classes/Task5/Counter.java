package com.company.classes.simple_classes.Task5;

public class Counter {

    private int countMax, countMin, countCurrent;

    public Counter() {
        countMax = 10;
        countMin = 0;
        countCurrent = 5;

    }

    public Counter(int countMax, int countMin, int countCurrent) {
        this.countMax = countMax;
        this.countMin = countMin;
        this.countCurrent = countCurrent;
    }

    public void countPlus() {
        countCurrent++;
        if (countCurrent > countMax)
            countCurrent = countMin;
    }

    public void countMinus() {
        countCurrent--;
        if (countCurrent < countMin)
            countCurrent = countMax;
    }

    public void printCountCurrent() {
        System.out.println("Count current is: " + countCurrent);
    }
}

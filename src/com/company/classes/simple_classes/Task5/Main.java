package com.company.classes.simple_classes.Task5;

public class Main {
    //5. Опишите класс, реализующий десятичный счетчик, который может увеличивать или уменьшать свое
    // значение на единицу в заданном диапазоне. Предусмотрите инициализацию счетчика значениями
    // по умолчанию и произвольными значениями. Счетчик имеет методы увеличения и уменьшения состояния,
    // и метод позволяющее получить его текущее состояние. Написать код, демонстрирующий все возможности класса.
    public static void main(String[] args) {
        Counter count1 = new Counter();
        count1.printCountCurrent();
        count1.countPlus();
        count1.countPlus();
        count1.printCountCurrent();
    }
}

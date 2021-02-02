package com.company.classes.simple_classes.Task1;

public class Main {
    //1. Создайте класс Test1 двумя переменными. Добавьте метод вывода на экран и методы изменения этих переменных.
    // Добавьте метод, который находит сумму значений этих переменных, и метод, который находит наибольшее значение
    // из этих двух переменных.

    public static void main(String[] args) {
        Test1 tester = new Test1();
        tester.printAB();
        tester.changeAB();
        tester.printAB();
        System.out.println("max a,b= " + tester.maxAB());
        System.out.println("Sum a+b= "+tester.sumAB());
    }


}

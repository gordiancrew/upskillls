package com.company.classes.simple_classes.Task2;

public class Main {
    //2. Создйте класс Test2 двумя переменными. Добавьте конструктор с входными параметрами. Добавьте конструктор,
    // инициализирующий члены класса по умолчанию. Добавьте set- и get- методы для полей экземпляра класса.

    public static void main(String[] args) {
        Test2 tester1=new Test2();
        Test2 tester2=new Test2(3,7);
        tester1.printAB();
        tester2.printAB();
        tester1.setA(10);
        tester1.printAB();
    }
}

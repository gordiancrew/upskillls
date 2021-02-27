package com.company.OOP.Tasks.Task5;

import com.company.OOP.Tasks.Task5.Elements.Element;
import com.company.OOP.Tasks.Task5.Elements.Flower;
import com.company.OOP.Tasks.Task5.Elements.Greens;
import com.company.OOP.Tasks.Task5.Elements.Packagings.Box;
import com.company.OOP.Tasks.Task5.Elements.Packagings.Paper;
import com.company.OOP.Tasks.Task5.Elements.Packagings.Tape;
import com.company.OOP.Tasks.Task5.Enams.*;

public class Main {
    //Создать консольное приложение, удовлетворяющее следующим требованиям:
    //Корректно спроектируйте и реализуйте предметную область задачи.
    //Для создания объектов из иерархии классов продумайте возможность использования порождающих шаблонов проектирования.
    //Реализуйте проверку данных, вводимых пользователем, но не на стороне клиента.
    //для проверки корректности переданных данных можно применить регулярные выражения.
    //Меню выбора действия пользователем можно не реализовывать, используйте заглушку.
    //Особое условие: переопределите, где необходимо, методы toString(), equals() и hashCode().
    //Вариант A. Цветочная композиция. Реализовать приложение, позволяющее создавать цветочные композиции
    // (объект, представляющий собой цветочную композицию). Составляющими цветочной композиции являются цветы и упаковка.
    private static boolean run=true;

    public static void setRun(boolean run) {
        Main.run = run;
    }

    public static void main(String[] args) {
        FlowerStore store1 = new FlowerStore();
        store1.createAssortiment();
       while (run)
           Menu.menu(store1);
    }
}

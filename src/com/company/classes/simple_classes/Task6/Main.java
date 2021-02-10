package com.company.classes.simple_classes.Task6;

public class Main {
    //6. Составьте описание класса для представления времени.
    // Предусмотрте возможности установки времени и изменения его отдельных полей (час, минута, секунда)
    // с проверкой допустимости вводимых значений.
    // В случае недопустимых значений полей поле устанавливается в значение 0.
    // Создать методы изменения времени на заданное количество часов, минут и секунд.

    public static void main(String[] args) {
       Timer2 t=new Timer2();
        System.out.println(t);
        t.rollHours(2);
        t.rollMinutes(33);
        t.rollSeconds(9);
        System.out.println(t);
        t.rollSeconds(60);
        System.out.println(t);
        t.rollSeconds(200);
        System.out.println(t);
        t.setMinutes(100);
        System.out.println(t);
    }
}

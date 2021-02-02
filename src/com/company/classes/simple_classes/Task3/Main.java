package com.company.classes.simple_classes.Task3;

import java.util.ArrayList;

import static com.company.classes.simple_classes.Task3.Student.printGoodStudent;

public class Main {
    //3. Создайте класс с именем Student, содержащий поля: фамилия и инициалы, номер группы,
    // успеваемость (массив из пяти элементов). Создайте массив из десяти элементов такого типа.
    // Добавьте возможность вывода фамилий и номеров групп студентов, имеющих оценки, равные только 9 или 10.

    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student("Nesterov A.A.", 215, new int[]{5, 6, 4, 8, 9}));
        list.add(new Student("Kovalevich E.V.", 222, new int[]{9, 9, 9, 9, 9}));
        list.add(new Student("Dmitriev V.O.", 215, new int[]{10, 9, 9, 9, 9}));
        list.add(new Student("Kozakov V.A.",232,new int[]{8,8,8,8,8}));
        list.add(new Student("Beljaev Z.Z.", 222, new int[]{9,10,9,10,9}));
        list.add(new Student("Lobov L.E.",222, new int[]{4,5,6,7,8}));
        list.add(new Student("Zajceva E.O.", 215,new int[]{9,10,10,10,10}));
        list.add(new Student("Volkov V.V.",222,new int[]{9,8,7,6,5}));
        list.add(new Student("Dikov D.D.",233,new int[]{10,10,10,10,10}));
        list.add(new Student("Loseva E.E.",214,new int[]{9,2,2,2,2}));
        printGoodStudent(list);
    }
}

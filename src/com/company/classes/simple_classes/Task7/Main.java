package com.company.classes.simple_classes.Task7;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class Main {
    //7. Описать класс, представляющий треугольник. Предусмотреть методы для создания объектов, вычисления площади,
    // периметра и точки пересечения медиан.
    public static void main(String[] args) {
        Triangle s = new Triangle(11,11,11,22,22,11);
        NumberFormat formater = new DecimalFormat("0.00");
        s.printSidesTriangle();
        System.out.println("Square triangle is : "+formater.format(s.squareTriangle()));
        System.out.println("Perimetr triangle is : "+formater.format(s.perimetrTriangle()));
    }
}

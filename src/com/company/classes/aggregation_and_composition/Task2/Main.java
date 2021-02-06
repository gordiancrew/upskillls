package com.company.classes.aggregation_and_composition.Task2;

public class Main {
    //2. Создать объект класса Автомобиль, используя классы Колесо, Двигатель.
    // Методы: ехать, заправляться, менять колесо, вывести на консоль марку автомобиля.
    public static void main(String[] args) {
        Weel weel1 = new Weel(22, "winter", "michline");
        Weel wee2=new Weel(20,"summer","brihgtstone");
        System.out.println(weel1);
        Engine engine1 = new Engine();
        System.out.println(engine1);
        engine1.setFirm("Opel");
        engine1.setVolume(1.2);
        engine1.setPower(110);
        engine1.setType("diesel");
        System.out.println(engine1);
        Car car1 = new Car("renault", "black", "888ER1", new Weel[]{weel1, weel1, weel1, weel1}, engine1);
        System.out.println(car1);
        car1.carGo();
        car1.carRefueling();
        car1.changeWeel(1,wee2);
        System.out.println(car1);
    }
}

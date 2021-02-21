package com.company.OOP.Tasks.Task3;

public class Main {
    //Создать класс Календарь с внутренним классом,
    // с помощью объектов которого можно хранить информацию о выходных и праздничных днях.

    public static void main(String[] args) {
        Calendar c2022= new Calendar(2022);
        c2022.addHolydayDay(1,1,"New Year");
        c2022.addHolydayDay(7,1,"Cristmas");
        c2022.addHolydayDay(8,3,"Women's Day");
        c2022.addHolydayDay(3,07,"Independen's Day");
        c2022.addHolydayDay(25,12,"Cristmas");
        c2022.printHolydayDays();

    }

}

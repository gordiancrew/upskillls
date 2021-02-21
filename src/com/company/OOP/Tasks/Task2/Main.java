package com.company.OOP.Tasks.Task2;

public class Main {
    //Создать класс Payment с внутренним классом,
    // с помощью объектов которого можно сформировать покупку из нескольких товаров.
    public static void main(String[] args) {

        Payment pay1= new Payment("Evroopt");
        pay1.buyProduct("bread",3.3);
        pay1.buyProduct("meat", 10.1);
        pay1.buyProduct("eggs",4.23);
        pay1.printChek();


    }
}

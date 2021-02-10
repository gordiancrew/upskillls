package com.company.classes.simple_classes.Task8;

import java.math.BigInteger;

public class Main {
    //8. Создать класс Customer, спецификация которого приведена ниже. Определить конструкторы,
    // set- и get- методы и метод  toString(). Создать второй класс, агрегирующий массив типа Customer,
    // с подходящими конструкторами и методами. Задать критерии выбора данных и вывести эти данные на консоль.
    //Класс Customer: id, фамилия, имя, отчество, адрес, номер кредитной карточки, номер банковского счета.
    //Найти и вывести:
    //a) список покупателей в алфавитном порядке;
    //b) список покупателей, у которых номер кредитной карточки находится в заданном интервале
    public static void main(String[] args) {

        CustomersList sunday = new CustomersList();
        sunday.setCustomer(new Customer("Ignatov S. D.", "Minsk", new BigInteger("1111222233334444"), new BigInteger("9999222299992222")));
        sunday.setCustomer(new Customer("Beljaev V.V.", "Gomel", new BigInteger("1111333322224444"), new BigInteger("9999888877778888")));
        sunday.setCustomer(new Customer("Sivakov S.S.", "Vitebsk", new BigInteger("2222222233333333"), new BigInteger("9999000000009999")));
        sunday.setCustomer(new Customer("Arsenov D.D.", "Brest", new BigInteger("7777111111111111"), new BigInteger("8888888899996666")));
        sunday.setCustomer(new Customer("Demidov E.E.", "Brest", new BigInteger("1111111111113333"), new BigInteger("9999000000000000")));
        CustomersList monday = new CustomersList();
        monday.setCustomer(new Customer("Losev A.A.", "Minsk", new BigInteger("1111111111114444"), new BigInteger("9999777777777777")));
        monday.setCustomer(new Customer("Ivanov I.I.", "Vitebsk", new BigInteger("1111121212124444"), new BigInteger("9999999977772222")));
        monday.setCustomer(new Customer("Solonev V.V.", "Brest", new BigInteger("2222333322223333"), new BigInteger("9999888866662222")));
        monday.setCustomer(new Customer("Davidov D.D.", "Minsk", new BigInteger("2222111111111111"), new BigInteger("9999999999990000")));
        System.out.println("SUNDAY LIST:\n" + sunday);
        sunday.sortCustomersLetters();
        sunday.listCustomersByCreditNumber(new BigInteger("1111111111111111"), new BigInteger("2222222222222222"));
        sunday.sortCustomersLetters();


    }
}

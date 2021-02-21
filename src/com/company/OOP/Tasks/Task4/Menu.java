package com.company.OOP.Tasks.Task4;

import java.util.Scanner;

import static com.company.OOP.Tasks.Task4.Account.*;


public class Menu {
    public static void menu() {
        Scanner scanner = new Scanner(System.in);
        boolean isWorking = true;
        System.out.println("\nMENU \nВыберите действие: " +
                "\n1-Список сокровищ." +
                "\n2-Самое дорогое сокровище." +
                "\n3-заказ сокровищ на заданную сумму." +
                "\n0-выход из программы.");

        while (isWorking) {
            int select = scanner.nextInt();
            switch (select) {

                case 1:
                    printTreasureList();
                    isWorking = false;
                    menu();
                    break;
                case 2:
                    printExpensiveTreasure();
                    isWorking=false;
                    menu();
                    break;
                case 3:
                    System.out.println("Введите сумму ваших денег: ");
                    int money = scanner.nextInt();
                    Account a1 = new Account(money);
                    a1.buyTreasures();
                    isWorking = false;
                    menu();
                    break;
                case 0:
                    isWorking = false;
                    break;
                default:
                    System.out.println("incorrent");
                    break;
            }
        }
        scanner.close();
    }
}

package com.company.OOP.Tasks.Task5;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class Menu {
    public static void menu() throws FileNotFoundException {
        FlowerStore store = FlowerStore.getInstance();
        int select = 5;
        String input;
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nВыберите действие:" +
                "\n1-Просмотреть ассортимент штучной продукции." +
                "\n2-Составить свой букет." +
                "\n3-Просмотреть свой заказ." +
                "\n0-Выход.");
        if (scanner.hasNextInt()) {
            select = scanner.nextInt();
        } else {
            input = scanner.next();
        }
        switch (select) {
            case 0:
                Main.setRun(false);
                break;
            case 1:
                System.out.println("Ассортимент магазина:");
                store.printAssortiment();
                break;
            case 2:
                ElementList myBouquet = new ElementList("MyBouquet");
                System.out.println("Составляем букет:");
                boolean running = true;
                store.printFlowerList();
                while (running) {
                    System.out.println("Введите номер цветка по окончанию ввода цветов нажмите 0");
                    if (scanner.hasNextInt()) {
                        int sel2 = scanner.nextInt();
                        if (sel2 < 0 || sel2 > store.getFlowerList().size()) {
                            System.out.println("Incorrect input");
                        } else if (sel2 != 0) {
                            myBouquet.getElementList().add(store.getFlowerList().get(sel2 - 1));
                            System.out.println("Добавлен " + store.getFlowerList().get(sel2 - 1).toString() + "\n" +
                                    "Добавить еще цветок?");
                        } else
                            running = false;

                    } else {
                        System.out.println(scanner.next() + "- incorrect input.");
                    }
                }
                running = true;
                System.out.println("Добавим зелень:");
                store.printGreensList();
                while ((running)) {
                    System.out.println("Введите номер зелени, по окончанию ввода нажмите 0");
                    if (scanner.hasNextInt()) {
                        int sel3 = scanner.nextInt();
                        if (sel3 < 0 || sel3 > store.getGreensList().size()) {
                            System.out.println("Incorrect input.");
                        } else if (sel3 != 0) {
                            myBouquet.getElementList().add(store.getGreensList().get(sel3 - 1));
                            System.out.println("Добавдено: " + store.getGreensList().get(sel3 - 1).toString() + "\n" +
                                    "Добавить еще зелени?");
                        } else
                            running = false;
                    } else
                        System.out.println(scanner.next() + "-incorrect input.");
                }
                running = true;
                System.out.println("Во что упакуем?");
                store.printPackagingList();
                while (running) {
                    System.out.println("Введите номер упаковки, по окончанию нажмите 0");
                    if (scanner.hasNextInt()) {
                        int sel4 = scanner.nextInt();
                        if (sel4 < 0 || sel4 > store.getPackaging().size())
                            System.out.println("incorrect input");
                        else if (sel4 != 0) {
                            myBouquet.getElementList().add(store.getPackaging().get(sel4 - 1));
                            System.out.println("Добавлено: " + store.getPackaging().get(sel4 - 1).toString() + "\n" +
                                    "еще упаковки?");
                        } else
                            running = false;
                    } else {
                        System.out.println(scanner.next() + "-incorrect input");
                    }
                }
                System.out.println("Составлен и добавлен в заказ букет:");
                System.out.println(myBouquet.toString());
                store.setBouquetOnAccount(myBouquet);
                break;
            case 3:
                System.out.println("\nМой заказ:");
                store.printMyAccount();
                System.out.println("Сумма заказа: " + store.sumAccount() + '$');
                break;

            default:
                System.out.println("incorrect");
                break;
        }
    }
}

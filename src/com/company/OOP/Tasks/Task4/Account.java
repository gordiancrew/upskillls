package com.company.OOP.Tasks.Task4;

import com.company.OOP.Tasks.Task4.Treasure.Treasure;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Scanner;

import static com.company.OOP.Tasks.Task4.Cave.getTreasures;

public class Account {

    private int money;
    private int sum;
    private Treasure treasure;
    private HashSet<Treasure> list = new HashSet<>();

    public Account(int money) {

        this.money = money;
        sum = 0;
    }

    public static void printTreasureList() {
        System.out.println("Список сокровищ:");
        for (int i = 0; i < getTreasures().size(); i++) {
            System.out.println((i + 1) + ")" + getTreasures().get(i).toString());
        }
    }

    public static void printExpensiveTreasure() {
        Comparator<Treasure> comp = Comparator.comparing(Treasure::getPrice);
        System.out.println("Самое дорогое сокровище пещеры:\n" + Collections.max(getTreasures(), comp).toString());
    }

    public void buyTreasures() {
        printTreasureList();
        System.out.println("Составте список покупок в пещере дракона, нажмите \"0\" для окончания ввода списка.");
        boolean isSelect = true;
        Scanner scan = new Scanner(System.in);
        while (isSelect) {
            int a = scan.nextInt();
            if (a == 0)
                isSelect = false;
            else if (a < 0 || a > getTreasures().size())
                System.out.println("incorrect");
            else
                selectTreasure(a);
        }

        System.out.println("Ваш заказ:\n" +
                list + "\nпотраченная сумма:" + sum + "\nостаток:" + (money - sum));
        System.out.println("Можете оплатить.");

    }

    public void selectTreasure(int numberTresure) {
        treasure = getTreasures().get(numberTresure - 1);
        if (list.contains(treasure))
            System.out.println("Уже выбирал, выбери другой");
        else {
            if ((sum + treasure.getPrice()) <= money) {
                sum += treasure.getPrice();
                list.add(treasure);
                System.out.println("Добавлено:" + getTreasures().get(numberTresure - 1).toString() + "осталось денег:" + (money - sum));
            } else
                System.out.println("Не хватает денег");
        }
    }
}

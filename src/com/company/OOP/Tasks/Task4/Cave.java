package com.company.OOP.Tasks.Task4;

import com.company.OOP.Tasks.Task4.Treasure.Coins;
import com.company.OOP.Tasks.Task4.Treasure.Papers;
import com.company.OOP.Tasks.Task4.Treasure.Stone;
import com.company.OOP.Tasks.Task4.Treasure.Treasure;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Cave {
    private static ArrayList<Treasure> treasures = new ArrayList<>();
    private static File file;

    static {
        file = new File("src/com/company/OOP/Tasks/Task4/Treasure/Stones.txt");
        Scanner scanner = null;
        try {
            scanner = new Scanner(new FileReader(file));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        while (scanner.hasNext()) {
            String name = scanner.next();
            int price = scanner.nextInt();
            String color = scanner.next();
            Treasure treasure = new Stone(name, price, color);
            treasures.add(treasure);
        }
        scanner.close();
    }

    static {
        file = new File("src/com/company/OOP/Tasks/Task4/Treasure/Coins.txt");
        Scanner scanner = null;
        try {
            scanner = new Scanner(new FileReader(file));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        while (scanner.hasNext()) {
            String name = scanner.next();
            int price = scanner.nextInt();
            String metal = scanner.next();
            Treasure treasure = new Coins(name, price, metal);
            treasures.add(treasure);
        }
        scanner.close();
    }

    static {
        file = new File("src/com/company/OOP/Tasks/Task4/Treasure/Papers.txt");
        Scanner scanner = null;
        try {
            scanner = new Scanner(new FileReader(file));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        while (scanner.hasNext()) {
            String name = scanner.next();
            int price = scanner.nextInt();
            int numberPages = scanner.nextInt();
            Treasure treasure = new Papers(name, price, numberPages);
            treasures.add(treasure);
        }
        scanner.close();
    }

    public static ArrayList<Treasure> getTreasures() {
        return treasures;
    }
}

package com.company.OOP.Tasks.Task5;

import com.company.OOP.Tasks.Task5.Elements.Element;
import com.company.OOP.Tasks.Task5.Elements.Flower;
import com.company.OOP.Tasks.Task5.Elements.Greens;
import com.company.OOP.Tasks.Task5.Elements.Package;
import com.company.OOP.Tasks.Task5.Elements.Packages.Box;
import com.company.OOP.Tasks.Task5.Elements.Packages.Paper;
import com.company.OOP.Tasks.Task5.Elements.Packages.Tape;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

public class FlowerStore {
    static ElementList assortiment;
    static ElementList flowers;
    static ElementList greens;
    static ElementList packaging;
    static ArrayList<ElementList> bouquets;
    ArrayList<ElementList> account = new ArrayList<>();
    private static FlowerStore instance;
    public static final String FLOWERS_FILE = "src/com/company/OOP/Tasks/Task5/res/Flowers.txt";
    public static final String GREENS_FILE = "src/com/company/OOP/Tasks/Task5/res/Greens.txt";
    public static final String BOXES_FILE = "src/com/company/OOP/Tasks/Task5/res/Packages/Boxes.txt";
    public static final String PAPERS_FILE = "src/com/company/OOP/Tasks/Task5/res/Packages/Papers.txt";
    public static final String TAPES_FILE = "src/com/company/OOP/Tasks/Task5/res/Packages/Tapes.txt";
    private FlowerStore() {
    }

    public static FlowerStore getInstance() {
        if (instance == null) {
            instance = new FlowerStore();
        }
        return instance;
    }

    public static void createAssortiment() throws FileNotFoundException {
        assortiment = new ElementList("Assortiment");
        createFlowers();
        createGreenss();
        createPackages();
        assortiment.setElementOnBouquet();
    }

    public static void createFlowers() throws FileNotFoundException {
        Scanner sc = new Scanner(new FileReader(FLOWERS_FILE));
        Element element;
        while (sc.hasNextLine()) {
            String[] flow = sc.nextLine().split(",");
            element = new Flower(flow[0], flow[1], Integer.parseInt(flow[2]), Integer.parseInt(flow[3]));
            assortiment.setElementOnBouquet(element);
        }
        sc.close();
    }

    public static void createGreenss() throws FileNotFoundException {
        Scanner sc = new Scanner(new FileReader(GREENS_FILE));
        Element element;
        while (sc.hasNextLine()) {
            String[] str = sc.nextLine().split(",");
            element = new Greens(str[0], Integer.parseInt(str[1]));
            assortiment.setElementOnBouquet(element);
        }
        sc.close();
    }

    public static void createPackages() throws FileNotFoundException {

        Element element;
        String[] str;
        Scanner sc = new Scanner(new FileReader(BOXES_FILE));
        while (sc.hasNextLine()) {
            str = sc.nextLine().split(",");
            element = new Box(str[0], str[1], Integer.parseInt(str[2]));
            assortiment.setElementOnBouquet(element);
        }
        sc.close();
        Scanner sc1 = new Scanner(new FileReader(PAPERS_FILE));
        while (sc1.hasNextLine()) {
            str = sc1.nextLine().split(",");
            element = new Paper(str[0], str[1], Integer.parseInt(str[2]));
            assortiment.setElementOnBouquet(element);
        }
        sc1.close();
        Scanner sc2 = new Scanner(new FileReader(TAPES_FILE));
        while (sc2.hasNextLine()) {
            str = sc2.nextLine().split(",");
            element = new Tape(str[0], Integer.parseInt(str[1]));
            assortiment.setElementOnBouquet(element);
        }
        sc2.close();

    }

    public ArrayList<ElementList> getBouquets() {
        return bouquets;
    }

    public void setBouquetOnAccount(ElementList bouquet) {
        account.add(bouquet);
    }

    public void printMyAccount() {
        printElementList(account);
    }

    public ArrayList<Element> getAssortimentList() {
        return assortiment.getElementList();
    }

    public ArrayList<Element> getFlowerList() {
        flowers = new ElementList("Flowers");
        for (Element x : assortiment.getElementList()) {
            if (x.getClass().equals(Flower.class)) {
                flowers.setElementOnBouquet(x);
            }
        }
        return flowers.getElementList();
    }

    public int sumAccount() {
        int sum = 0;
        for (ElementList x : account) {
            sum += x.bouquetCoast();
        }
        return sum;
    }

    public ArrayList<Element> getGreensList() {
        greens = new ElementList("Greens");
        for (Element x : assortiment.getElementList()) {
            if (x.getClass().equals(Greens.class)) {
                greens.setElementOnBouquet(x);
            }
        }
        return greens.getElementList();
    }

    public ArrayList<Element> getPackaging() {
        packaging = new ElementList("Packaging");
        for (Element x : assortiment.getElementList()) {
            //if (x.getClass().equals(Packaging.class))
            if (x instanceof Package) {
                packaging.setElementOnBouquet(x);
            }
        }
        return packaging.getElementList();
    }

    public void printElementList(ArrayList list) {

        for (int i = 0; i < list.size(); i++) {
            System.out.println((i + 1) + ")" + list.get(i));
        }
    }

    public static ElementList getAssortiment() {
        return assortiment;
    }

    public ArrayList<ElementList> getAccount() {
        return account;
    }

    public void printAssortiment() {
        printElementList(getAssortimentList());
    }

    public void printFlowerList() {
        printElementList(getFlowerList());
    }

    public void printGreensList() {
        printElementList(getGreensList());
    }

    public void printPackagingList() {
        printElementList(getPackaging());
    }

    public void printBouquets() {
        printElementList(bouquets);
    }

    @Override
    public String toString() {
        return "FlowerStore{" +
                "assortiment=" + assortiment +
                '}';
    }
}


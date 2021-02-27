package com.company.OOP.Tasks.Task5;

import com.company.OOP.Tasks.Task5.Elements.Element;
import com.company.OOP.Tasks.Task5.Elements.Flower;
import com.company.OOP.Tasks.Task5.Elements.Greens;
import com.company.OOP.Tasks.Task5.Elements.Packaging;
import com.company.OOP.Tasks.Task5.Elements.Packagings.Box;
import com.company.OOP.Tasks.Task5.Elements.Packagings.Paper;
import com.company.OOP.Tasks.Task5.Elements.Packagings.Tape;
import com.company.OOP.Tasks.Task5.Enams.*;

import java.util.ArrayList;

public class FlowerStore {
    ElementList assortiment;
    ElementList flowers;
    ElementList greens;
    ElementList packaging;
ArrayList<ElementList>bouquets;
ArrayList<ElementList>account=new ArrayList<>();

    public FlowerStore() {
        assortiment = new ElementList("Assortiment");

    }


    public void createAssortiment() {
        Element rose1 = new Flower(SortFlower.ROSE, Color.RED, 50, 5);
        Element rose2 = new Flower(SortFlower.ROSE, Color.WHITE, 50, 5);
        Element rose3 = new Flower(SortFlower.ROSE, Color.BLUE, 50, 5);
        Element rose4 = new Flower(SortFlower.ROSE, Color.RED, 55, 6);
        Element rose5 = new Flower(SortFlower.ROSE, Color.WHITE, 60, 6);
        Element rose6 = new Flower(SortFlower.ROSE, Color.RED, 90, 7);
        Element chamomile1 = new Flower(SortFlower.CHAMOMILE, Color.WHITE, 60, 3);
        Element chamomile2 = new Flower(SortFlower.CHAMOMILE, Color.WHITE, 30, 2);
        Element carnation1 = new Flower(SortFlower.CARNATION, Color.RED, 50, 3);
        Element gerbera1 = new Flower(SortFlower.GERBERA, Color.GREEN, 50, 4);
        Element gerbera2 = new Flower(SortFlower.GERBERA, Color.YELLOW, 50, 4);
        Element lily1 = new Flower(SortFlower.LILY, Color.YELLOW, 70, 4);
        Element tulip1 = new Flower(SortFlower.TULIP, Color.MULTICOLOR, 40, 2);
        Element tulip2 = new Flower(SortFlower.TULIP, Color.RED, 40, 2);
        Element pistachio1 = new Greens(SortGreens.PISTACHIO, 1);
        Element ruscus1 = new Greens(SortGreens.RUSCUS, 1);
        Element fern1 = new Greens(SortGreens.FERN, 1);
        Element eucalyptus1 = new Greens(SortGreens.EUCALYPTUS, 2);
        Element paper1 = new Paper(TypePaper.CRAFT, Color.YELLOW, 1);
        Element paper2 = new Paper(TypePaper.GLOSS, Color.GREEN, 1);
        Element paper3 = new Paper(TypePaper.MATT, Color.BLUE, 1);
        Element box1 = new Box(TypeBox.CORTON, Color.BLUE, 3);
        Element box2 = new Box(TypeBox.WOODEN, Color.RED, 3);
        Element tape1 = new Tape(Color.RED, 1);
        Element tape2 = new Tape(Color.YELLOW, 1);

        assortiment.setElementOnBouquet(rose1, rose2, rose3, rose4, rose5, rose6, carnation1, chamomile2, chamomile1, gerbera1, gerbera2,
                lily1, tulip1, tulip2, pistachio1, ruscus1, fern1, eucalyptus1, paper1, paper2, paper3, box1, box2, tape1, tape2);
        bouquets=new ArrayList<>();
        ElementList buket1 = new ElementList("Madonna");
        buket1.setElementOnBouquet(rose1,rose1,rose1,eucalyptus1,eucalyptus1,paper1);
        bouquets.add(buket1);
        ElementList buket2=new ElementList("15chamomile");
        buket2.setElementOnBouquet(chamomile1,chamomile1,chamomile1,chamomile1,chamomile1,chamomile1,chamomile1,chamomile1,chamomile1,chamomile1,chamomile1,chamomile1,chamomile1,chamomile1,chamomile1);
        bouquets.add(buket2);
        ElementList buket3=new ElementList("DreamBox");
        buket3.setElementOnBouquet(rose3,gerbera1,gerbera2,ruscus1,box1);
        bouquets.add(buket3);
    }
    public ArrayList<ElementList> getBouquets(){
        return bouquets;
    }
    public void setBouquetOnAccount(ElementList bouquet){
        account.add(bouquet);

    }

    public void printMyAccount(){
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

    public  int sumAccount(){
        int sum=0;
        for(ElementList x: account){
           sum+=x.bouquetCoast();
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
            if (x instanceof Packaging) {
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

    public  void printBouquets(){
        printElementList(bouquets);
    }

    @Override
    public String toString() {
        return "FlowerStore{" +
                "assortiment=" + assortiment +
                '}';
    }
}


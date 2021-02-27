package com.company.OOP.Tasks.Task5;

import com.company.OOP.Tasks.Task5.Elements.Element;

import java.util.ArrayList;
import java.util.Objects;

public class ElementList {
    private String name;
    ArrayList<Element> elementList;

    public ElementList(String name) {
        elementList = new ArrayList<>();
        this.name = name;
    }

    public void setElementOnBouquet(Element... element) {
        for (Element x : element)
            elementList.add(x);
    }

    public String getName() {
        return name;
    }
    public int bouquetCoast(){
        int sum=0;
        for(Element x: elementList)
            sum+=x.getPrice();
        return sum;
    }

    public ArrayList<Element> getElementList() {
        return elementList;
    }

    @Override
    public String toString() {
        return "{" +
                "name='" + name + '\'' +
                ", coast bouquet="+bouquetCoast()+'$'+
                ", elementList=" + elementList +
                "coast bouquet="+bouquetCoast()+
                '}';
    }
}
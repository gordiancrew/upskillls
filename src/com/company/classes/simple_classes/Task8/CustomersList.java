package com.company.classes.simple_classes.Task8;

import com.company.algoritmization.decomposition.Task5project.Array;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class CustomersList {
    private ArrayList<Customer> list;

    public CustomersList() {
        list = new ArrayList<>();
    }

    public void setCustomer(Customer customer) {
        list.add(customer);
    }

    public ArrayList<Customer> getList() {
        return list;
    }

    public ArrayList<Customer> sortCustomersLetters() {
        System.out.println("SORT ALFABET LIST:");
        ArrayList<Customer> listSort = list;
        Comparator<Customer> comp = Comparator.comparing(Customer::getName);
        Collections.sort(listSort, comp);
        return listSort;
    }


    public ArrayList listCustomersByCreditNumber(BigInteger min, BigInteger max) {
        System.out.println("SORT CREDIT NUMBER LIST:");
        ArrayList<Customer>sortCreditNumber=new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if ((list.get(i).getCredinNumber()).compareTo(max) <= 0 && list.get(i).getCredinNumber().compareTo(min) >= 0) {
               sortCreditNumber.add(list.get(i));
            }
        }
        return sortCreditNumber;
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        for (Customer x : list) {
            str.append(x);
            str.append("\n");
        }
        return str.toString();
    }
}

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
        Comparator<Customer> comp = Comparator.comparing(Customer::getName);

        Collections.sort(list, comp);
        return list;
    }

    public ArrayList<Customer> listCustomersByCreditNumber(BigInteger min, BigInteger max) {
        for (int i = 0; i < list.size(); i++) {
            if ((list.get(i).getCredinNumber()).compareTo(max) > 0 || list.get(i).getCredinNumber().compareTo(min) < 0) {
                list.remove(i);
                i--;
            }
        }
        return list;
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

package com.company.classes.aggregation_and_composition.Task4;

import java.util.ArrayList;
import java.util.Comparator;

public class AccountsList {
    private ArrayList<Account> list;

    public AccountsList() {
        list = new ArrayList<>();
    }

    public AccountsList(ArrayList<Account> list) {
        this.list = list;
    }


    public void setList(ArrayList<Account> list) {
        this.list = list;
    }

    public void setAccount(Account a) {
        list.add(a);
    }

    public ArrayList<Account> getList() {
        return list;
    }

    public void searcAccountForNumber(long number) {
        boolean search = false;
        System.out.println("Find by account number " + number + " : ");
        for (Account x : list) {
            if (x.getNumber() == number) {
                System.out.println(x);
                search = true;
            }
        }
        if (!search)
            System.out.println("not found.");

    }

    public void searchAccountForName(String name) {
        System.out.println("Account(s) " + name + " is :");
        boolean search = false;
        for (Account x : list) {

            if (x.getName().equals(name)) {
                search = true;
                System.out.println(x);
            }
            if (!search)
                System.out.println("not");
        }
    }

    public void sortAccountsForCash() {
        Comparator comparator = Comparator.comparing(Account::getCash);
        list.sort(comparator);
    }

    public void printSumCash() {
        long sum = 0;
        for (Account x : list) {
            sum += x.getCash();
        }
        System.out.println("Sum cash of all acounts is : " + sum);
    }

    public void printSumPositiveNegative() {
        long sumPlus = 0;
        long sumMinus = 0;
        for (Account x : list) {
            if (x.getCash() > 0)
                sumPlus += x.getCash();
            else
                sumMinus += x.getCash();
        }
        System.out.println("Sum cash positive is: " + sumPlus + ", sum cash negative is: " + sumMinus);

    }

    @Override
    public String toString() {
        return "AccountsList{" +
                "list=" + list +
                '}';
    }
}

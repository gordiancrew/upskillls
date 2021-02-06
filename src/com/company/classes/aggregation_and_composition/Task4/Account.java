package com.company.classes.aggregation_and_composition.Task4;

public class Account {
    private String name;
   private long number;
    private long cash;
    private  Boolean activ;
    public  Account(String name,long number,long cash){
        this.name=name;
        this.number=number;
        this.cash=cash;
        activ=true;
    }
    public void blockAccount(){
        activ=false;
    }
    public  void unblockAccount(){
        activ=true;
    }

    public void putCash(long putCash){
        if(activ) {
            cash += putCash;
            System.out.println("You have replenished your account on "+putCash+" dollars");
        }
        else
            System.out.println("Your account is block!");

    }
    public  void pullCash(long getCash){
        if(activ) {
            cash -= getCash;
            System.out.println("You have withdrawn from the account "+getCash+" dollars");
        }
        else
            System.out.println("Your account is block!");

    }

    public long getCash() {
        return cash;
    }

    public String getName() {
        return name;
    }

    public long getNumber() {
        return number;
    }

    @Override
    public String toString() {
        return "Account{" +
                "name='" + name + '\'' +
                ", number=" + number +
                ", cash=" + cash +
                ", activ=" + activ +
                '}';
    }
}

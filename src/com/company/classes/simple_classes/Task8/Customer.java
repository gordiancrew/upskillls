package com.company.classes.simple_classes.Task8;

import java.math.BigInteger;

public class Customer {

    private int id;
    private static int generatorID = 0;
    private String name;
    private String adress;
    private BigInteger credinNumber;
    private BigInteger bankNumber;

    public Customer(String name, String adress, BigInteger creditNumber, BigInteger bankNumber) {
        this.name = name;
        this.adress = adress;
        this.credinNumber = creditNumber;
        this.bankNumber = bankNumber;
        generatorID++;
        id = generatorID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getAdress() {
        return adress;
    }

    public void setCreditNumber(BigInteger credinNumber) {
        this.credinNumber = credinNumber;
    }

    public BigInteger getCredinNumber() {
        return credinNumber;
    }

    public void setBankNumber(BigInteger bankNumber) {
        this.bankNumber = bankNumber;
    }

    public BigInteger getBankNumber() {
        return bankNumber;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "name is: " + getName() + ", id is: " + getId() + ", adress is: " + getAdress() + ", credit number is: " +
                getCredinNumber() + ", bank number is: " + getBankNumber();
    }
}

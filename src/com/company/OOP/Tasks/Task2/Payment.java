package com.company.OOP.Tasks.Task2;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Formatter;

public class Payment {
    private String shopName;
    private double sumPayment;
    ArrayList<Product> productList;
    NumberFormat formatter=new DecimalFormat("0.00");

    public Payment(String shopName) {
        this.shopName = shopName;
        productList = new ArrayList<>();
        sumPayment = 0;
    }

    public void buyProduct(String name, double price) {
        productList.add(new Product(name, price));
        sumPayment += price;
    }

    public void printChek() {
        System.out.println("Payment on shop\"" + shopName + "\":");
        for (int i = 0; i < productList.size(); i++) {
            System.out.println((i + 1) + ")" + productList.get(i).getProductName() +
                    "-----" + productList.get(i).getPrice() + "$");
        }
        System.out.println("----------------------------------------------\n" +
                "Summ = " + formatter.format(sumPayment) + "$");
    }

    private class Product {
        private String productName;
        private double price;

        private Product(String productName, double price) {
            this.productName = productName;
            this.price = price;
        }

        private double getPrice() {
            return price;
        }

        private String getProductName() {
            return productName;
        }
    }

}

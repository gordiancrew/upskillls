package com.company.classes.aggregation_and_composition.Task5;

public class Voucher2 extends Voucher {
    public String str;
    public static String str2;

    {
        str = "String";

    }

    static {
        str2 = "String2";

    }
    {
      printA();

    }

    public Voucher2(Transport transport, Food food, int priceDay, String country, TypeVoucher type) {
        super(transport, food, priceDay, country, type);
    }


    public static void printA() {
        System.out.println("B");


    }


}

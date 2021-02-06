package com.company.classes.aggregation_and_composition.Task5;

import java.util.ArrayList;
import java.util.Comparator;

public class VouchersList {
    ArrayList<Voucher> vList;
    private int price;

    public VouchersList() {
        vList = new ArrayList<>();
    }

    public void setVoucher(Voucher voucher) {
        vList.add(voucher);
    }

    public void searchVoucher(Transport transport, Food food, String country, TypeVoucher typeVoucher, int numberDay) {
        ArrayList<Voucher> variants = new ArrayList<>();
        for (Voucher x : vList) {
            if (transport.equals(x.getTransport()) && food.equals(x.getFood()) && country.equals(x.getCountry()) && typeVoucher.equals(x.getType())) {
                x.setPrice(x.getPriceDay() * numberDay);
                variants.add(x);
            }
        }
        Comparator<Voucher> comparator = Comparator.comparing(Voucher::getPrice);
        variants.sort(comparator);
        for (Voucher x : variants) {
            System.out.println(x + "Price voucher is: " + x.getPrice());


        }

    }


}

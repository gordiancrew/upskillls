package com.company.classes.aggregation_and_composition.Task5;

public class Voucher {
    Transport transport;
    Food food;
    int priceDay;
    String country;
    TypeVoucher type;
    int price;
    public Voucher(Transport transport, Food food, int priceDay, String country,TypeVoucher type ){
        this.transport=transport;
        this.food= food;
        this.priceDay=priceDay;
        this.country=country;
        this.type=type;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setTransport(Transport transport) {
        this.transport = transport;
    }

    public Transport getTransport() {
        return transport;
    }

    public void setType(TypeVoucher type) {
        this.type = type;
    }

    public TypeVoucher getType() {
        return type;
    }

    public void setFood(Food food) {
        this.food = food;
    }

    public Food getFood() {
        return food;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCountry() {
        return country;
    }

    public void setPriceDay(int priceDay) {
        this.priceDay = priceDay;
    }

    public int getPriceDay() {
        return priceDay;
    }

    @Override
    public String toString() {
        return "Voucher{" +
                "transport=" + transport +
                ", food=" + food +
                ", priceDay=" + priceDay +
                ", country='" + country + '\'' +
                ", type=" + type +
                '}';
    }
}

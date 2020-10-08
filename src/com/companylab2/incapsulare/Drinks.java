package com.companylab2.incapsulare;

public class Drinks {

    private String types;
    private int quantity;
    private double price;

    //constructor
    public Drinks(String types, int quantity,  double price) {
        this.types = types;
        this.quantity = quantity;
        this.price = price;
    }
    public Drinks (String types, double price) {
        this.types = types;
        this.price = price;
    }
    public String getTypes() {
        return types;
    }

    public void setTypes(String types) {
        this.types = types;
    }

    public Drinks(int quantity) {

        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}


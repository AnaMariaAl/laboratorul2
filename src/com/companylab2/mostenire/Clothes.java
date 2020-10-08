package com.companylab2.mostenire;

public class Clothes {
    private String brand;
    private String size;
    private String type; //for women or men
    private String year;

    public Clothes(String brand, String size, String type, String year) {
        this.brand = brand;
        this.size = size;
        this.type = type;
        this.year = year;
    }

    public String print() {
        return " Bradul : " + brand + "\n" +
                "Marimea : " + size + "\n" +
                "Tipul de haine: " + type + "\n" +
                "Anul: " + year + "\n";
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }
}

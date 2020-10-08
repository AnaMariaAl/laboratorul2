package com.companylab2.incapsulare;

public class Book {

    private String author;
    private String titlu;
    private double price;
    private int nrpages;
    //constrctor 1
    public Book(String author, String titlu, double price) {
        this.author = author;
        this.titlu = titlu;
        this.price = price;
    }
    //constructorul 2
    public Book(double price, String author, String titlu, int nrpages) {
        this.price = price;
        this.author = author;
        this.titlu  = titlu;
        this.nrpages = nrpages;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }
    public void setTitlu(String titlu) {
        this.titlu = titlu;
    }
    public String getTitlu() {
        return titlu;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
    public String getAuthor() {
        return author;
    }
    public void setNrpages(int nrpages) {
        this.nrpages = nrpages;
    }

    public int getNrpages() {
        return nrpages;


    }
}

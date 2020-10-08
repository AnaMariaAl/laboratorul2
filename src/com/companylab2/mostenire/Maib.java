package com.companylab2.mostenire;

public class Maib {

    private int nrfiliale;
    private int nraccountants;
    private String city;
    private int nrcashiers;
    private int nrmanagers;
    //constructor 1
    public Maib(int nrfiliale,int nraccountants,String city,int nrcashiers, int nrmanagers){
        this.nrfiliale = nrfiliale;
        this.nraccountants = nraccountants;
        this.city = city;
        this.nrcashiers = nrcashiers;
        this.nrmanagers = nrmanagers;
    }
    public String print() {
        return "Numarul  filialei : " +  nrfiliale + "\n" +
                "Numarul de contabili : " + nraccountants + "\n" +
                "Orasul : "  + city + "\n" +
                "Numarul de casieri: " + nrcashiers + "\n" +
                "Numarul de manageri: " + nrmanagers + "\n";
    }
    public int getNrfiliale() {
        return nrfiliale;
    }

    public void setNrfiliale(int nrfiliale) {
        this.nrfiliale = nrfiliale;
    }
    public int getNraccountants() {
        return nraccountants;
    }

    public void setNraccountants(int nraccountants) {
        this.nraccountants = nraccountants;
    }
    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
    public int getNrcashiers() {
        return nrcashiers ;
    }

    public void setNrcashiers(int nrcashiers) {
        this.nrcashiers = nrcashiers;
    }
    public int getNrmanagers() {
        return nrmanagers ;
    }

    public void setNrmanagers(int nrmanagers) {
        this.nrmanagers = nrmanagers;
    }
}


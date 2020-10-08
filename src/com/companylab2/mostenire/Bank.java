package com.companylab2.mostenire;

public class Bank extends Maib {
    private int nrcarsincastor;

    public Bank(int nrfiliale,int nraccountants,String city,int nrcashiers, int nrmanagers, int nrcarsincastor) {
        super(nrfiliale, nraccountants, city, nrcashiers, nrmanagers);
        this.nrcarsincastor = nrcarsincastor;
    }

    @Override
    public String print() {
        return super.print() +
                "Numarul de masini : " + nrcarsincastor;
    }

    public int getNrcarsincastor() {
        return nrcarsincastor;
    }

    public void setNrcarsincastor(int nrcarsincastor) {
        this.nrcarsincastor = nrcarsincastor;
    }
}


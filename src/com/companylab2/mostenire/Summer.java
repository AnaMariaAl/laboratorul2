package com.companylab2.mostenire;

public class Summer extends Clothes {
    private int price;
    private int discounts;

    public Summer(String brand, String size, String type, String year,int price,int discounts){
        super(brand,size,type,year);
        this.price = price;
        this.discounts = discounts;
    }
    @Override
    public String print() {
        return super.print() +
                "Pretul  : " + price + "\n" +
                "Reducere : " + discounts + "\n";
    }
    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    public int getDiscounts() {
        return discounts;
    }

    public void setDiscounts(int discounts) {
        this.discounts = discounts;
    }
}


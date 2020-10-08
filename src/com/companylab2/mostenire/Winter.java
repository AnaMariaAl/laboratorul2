package com.companylab2.mostenire;

public class Winter extends Clothes {
    String color;
    String material;//Materialul hainei

    public Winter(String brand, String size, String type, String year,String color,String material){
        super(brand,size,type,year);
        this.color = color;
        this.material = material;
    }
    @Override
    public String print() {
        return super.print() +
                "Culoarea hainei: " + color + "\n" +
                "Materialul hainei: " + material;
    }
    public String getColor() {
        return color;
    }

    public void setMaterial(String material) {
        this.material = material;
    }
}

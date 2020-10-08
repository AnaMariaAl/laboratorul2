package com.companylab2;
import com.companylab2.incapsulare.Book;
import com.companylab2.incapsulare.Drinks;
import com.companylab2.mostenire.Bank;
import com.companylab2.mostenire.Maib;
import com.companylab2.mostenire.Summer;
import com.companylab2.mostenire.Winter;


public class Main {
    public static void main(String[] args) {
        System.out.println("----------------------------\nIncapsularea\n----------------------------\n");

        Drinks alco = new Drinks("Wine", 200, 500), notalco = new Drinks("Water", 750, 15.50);
        System.out.println("Types:" + alco.getTypes());
        System.out.println("Quantity:" + alco.getQuantity());
        System.out.println("Price:" + alco.getPrice());

        System.out.println("----------------------------");

        System.out.println("Types:" + notalco.getTypes());
        System.out.println("Quantity:" + notalco.getQuantity());
        System.out.println("Price:" + notalco.getPrice());

        System.out.println("----------------------------");

        Drinks hot = new Drinks("Coffee", 30);
        hot.setPrice(35);
        System.out.println("Price of coffee" + hot.getTypes() + " : " + hot.getPrice());

        System.out.println("----------------------------");


        Book book = new Book("Mircea Eliade", "Maytrei ", 100);
        System.out.println("Author:" + book.getAuthor());
        System.out.println("Title: " + book.getTitlu());
        System.out.println("Price: " + book.getPrice());

        System.out.println("----------------------------");

        Book book1 = new Book(105, "Liviu Rebreanu", "Ion", 500);
        System.out.println("Price: " + book1.getPrice());
        System.out.println("Author: " + book1.getAuthor());
        System.out.println("Title: " + book1.getTitlu());
        System.out.println("The number of pages: " + book1.getNrpages());


        System.out.println("----------------------------");

        book1.setPrice(150);
        System.out.println("The price of the book" + "\"" + book1.getTitlu() + "\"" + " is  : " + book1.getPrice());

        System.out.println("\n----------------------------\nMostenirea\n----------------------------\n");

        Maib banca1 = new Maib(20,10,"Chisinau",15,2);
        System.out.println(banca1.print());

        System.out.println("----------------------------");

        Bank  bank2 = new Bank(15,7,"Balti",10,1,5);
        System.out.println(bank2.print());

        System.out.println("----------------------------");

        Summer clothes1 = new Summer("Prada","XS","Women","2020",100,5);
        System.out.println(clothes1.print());

        System.out.println("----------------------------");

        Winter clothes2= new Winter("Calvin Klein","M","Men","2020","Black","wool sweater");
        System.out.println(clothes2.print());

    }
}






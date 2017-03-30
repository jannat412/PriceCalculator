package com.example.mobileappdevelop.pricecalculator;

/**
 * Created by Mobile App Develop on 3/27/2017.
 */

public class TotalPrice {
    private double price;
    private double vat;
    private double discount;

    public TotalPrice(double price, double vat, double discount) {
        this.price = price;
        this.vat = vat;
        this.discount = discount;
    }
public double total (double price,double vat, double discount){
    double total = ((price+((price*vat)/100))-((price+((price*vat)/100))*discount)/100);
return total;
}
    public double getVat() {
        return vat;
    }

    public void setVat(double vat) {
        this.vat = vat;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }
}



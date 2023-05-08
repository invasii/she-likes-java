package com.sda.she_likes_java.homework.exercise22;

public class Item {
    private String productName;
    private double productPrice;

    public Item(String productName, double productPrice) {
        this.productName = productName;
        this.productPrice = productPrice;
    }

    public static Object get(int i) {
        return null;
    }

    public String getProductName() {
        return productName;
    }
public Item(){

}
    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }

    @Override
    public String toString() {
        return "Item{" +
                "productName='" + productName + '\'' +
                ", productPrice=" + productPrice +
                '}';
    }
}


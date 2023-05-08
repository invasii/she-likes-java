package com.sda.she_likes_java.homework.exercise22;

import java.util.List;
import java.util.ArrayList;

public class ItemsInStore extends Item {
    Item purchase1 = new Item("Potatoes", 2.39);
    Item purchase2 = new Item("Milk", 1.99);
    Item purchase3 = new Item("Butter", 3.89);
    Item purchase4 = new Item("Apples", 1.59);

    public List<Item> fullItemList = List.of(purchase1, purchase2, purchase3, purchase4);

    public ItemsInStore(String productName, double productPrice){
        super(productName, productPrice);

    }
    public ItemsInStore(){

    }

    public static void addItems(List<Item> shoppingCart) {
    }

    public Item getPurchase1() {
        return purchase1;
    }

    public void setPurchase1(Item purchase1) {
        this.purchase1 = purchase1;
    }

    public Item getPurchase2() {
        return purchase2;
    }

    public void setPurchase2(Item purchase2) {
        this.purchase2 = purchase2;
    }

    public Item getPurchase3() {
        return purchase3;
    }

    public void setPurchase3(Item purchase3) {
        this.purchase3 = purchase3;
    }

    public Item getPurchase4() {
        return purchase4;
    }

    public void setPurchase4(Item purchase4) {
        this.purchase4 = purchase4;
    }

    public List<Item> getFullItemList() {
        return fullItemList;
    }

    public void setFullItemList(List<Item> fullItemList) {
        this.fullItemList = fullItemList;
    }
}

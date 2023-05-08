package com.sda.she_likes_java.homework.exercise22;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hi, hope you found everything what you was looking for");
        List<String> purchaseList = new ArrayList<>();


        purchaseList.add(String.valueOf(new Item("Potatoes", 2.39)));
        purchaseList.add(String.valueOf(new Item("Milk", 1.99)));
        purchaseList.add(String.valueOf(new Item("Butter", 3.89)));
        purchaseList.add(String.valueOf(new Item("Apples", 1.59)));

        System.out.println(purchaseList);

    }
}

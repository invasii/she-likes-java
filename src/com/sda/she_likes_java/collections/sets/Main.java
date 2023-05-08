package com.sda.she_likes_java.collections.sets;

import com.sda.she_likes_java.collections.Trousers;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        System.out.println("Sets are designed for storing unique things/items");

        Set<Trousers> uniqueTrousers = new HashSet<>();
        uniqueTrousers.add(new Trousers("jeans", "big star"));
        uniqueTrousers.add(new Trousers("jeans", "big star"));
        uniqueTrousers.add(new Trousers("jeans", "big star"));
        uniqueTrousers.add(new Trousers("jeans", "big star"));
        uniqueTrousers.add(new Trousers("jeans", "big star"));
        uniqueTrousers.add(new Trousers("jeans", "big star"));

        System.out.println("size of the set is: " + uniqueTrousers.size());
        System.out.println("set of my trousers: " + uniqueTrousers);


        List<Trousers> trousersList = List.of(


                new Trousers("jeans", "big star"),
                new Trousers("jeans", "big star"),
                new Trousers("jeans", "big star")
        );

        Set<Trousers> anotherSet = new HashSet<>(trousersList); // here we check if there are duplicates in our list
        System.out.println("Let's check if my list had some duplication...");
        System.out.println(trousersList.size() == anotherSet.size()); // the answer is false due to the size difference of both lists

    }
}
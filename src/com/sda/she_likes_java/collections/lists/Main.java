package com.sda.she_likes_java.collections.lists;

import com.sda.she_likes_java.collections.Trousers;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int a = 5; // first value of our integer
        a = 6; // changed value of our integer

        final int b = 7;  // final modifier means that value of integer variable will never change, its purpose - not to change the value

        List<Trousers> trousers = new ArrayList<>(); // with array - list is expandable
        trousers.add(new Trousers("jeans", "big star"));
        trousers.add(new Trousers("jeans", "primemark"));

        showItemsFromTheList(trousers);
        // let's add another item to the list


        List<Trousers> trousersList = List.of(   // finishes list, does not allow to add anything else to the list (e.g. list named trousersList)
                new Trousers("jeans", "big star"),
                new Trousers("jeans", "big star"),
                new Trousers("jeans", "big star")
        );
        showItemsFromTheList(trousersList);

    }

    public static void showItemsFromTheList(List<Trousers> items) {
        // it is important to import java.util.Lists (above) and indicate object of our list
        // enhanced loop below, much more safe way
        for (Trousers currentItem: items) {
            System.out.println(currentItem);
        }

        // another loop
        for (int i = 0; i < items.size(); i++) {
            Trousers currentItem = items.get(i);
            System.out.println(currentItem);

        }
    }
}

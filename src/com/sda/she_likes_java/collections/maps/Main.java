package com.sda.she_likes_java.collections.maps;

import com.sda.she_likes_java.collections.Person;
import com.sda.she_likes_java.collections.Trousers;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        System.out.println("Maps are like dictionaries");

        Map<String, Trousers> myJeans = new HashMap<>();
        // key: "my favorite jeans -> type of the key (e.g. String)
        // value: new Trousers("jeans", "big star") -> type of the value is Trousers
        myJeans.put("my favorite jeans", new Trousers("jeans", "big star"));
        myJeans.put("my old one", new Trousers("unknown material", "primemark"));
        myJeans.put("my old one", new Trousers("unknown material", "primemark II")); // adding another key
        // overrides the first one, in this case primemark II overrides primemark
        printMyJeans(myJeans);

        Map<Person, Trousers> personTrousers = new HashMap<>();
        personTrousers.put(new Person("inga", "v"), new Trousers("good material", "primemark"));
        personTrousers.put(new Person("ona", "v"), new Trousers("good material", "primemark"));
        System.out.println("persons trousers: " + personTrousers);

    }
    public static void printMyJeans( Map<String, Trousers> trousersMap) {
        System.out.println("Let's start with known keys");
        System.out.println("key=my[ favorite jeans] " + trousersMap.get("my favorite jeans"));
        System.out.println("key=my[ favorite jeans] " + trousersMap.get("stupid key"));

        System.out.println("Let's iterate the map");
        // Map entry represents key + value at once
     for (Map.Entry<String, Trousers> item : trousersMap.entrySet()) {
        System.out.println("Key: " + item.getKey());
        System.out.println("Value: " + item.getValue());
        }
    }
}

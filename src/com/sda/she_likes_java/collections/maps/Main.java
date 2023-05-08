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

        Map<Person, Trousers> personTrousers = new HashMap<>();
        personTrousers.put(new Person("inga", "v"), new Trousers("good material", "primemark"));
        personTrousers.put(new Person("ona", "v"), new Trousers("good material", "primemark"));

    }
}

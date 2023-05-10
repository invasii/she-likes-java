package com.sda.she_likes_java.collections.maps;



import com.sda.she_likes_java.collections.Person;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapsExample {

    public static void main(String[] args) {
        // wrappers: Long, Integer
        //are necessary for collections, because we are not able to use List<int> integers
        //this is one of the reasons why we used Long in second example
        int a = 0;
        Integer aInteger = null;
        List<Integer> intNumbers = new ArrayList<>();
        intNumbers.add(1);
        intNumbers.add(2);
        intNumbers.add(3);
        intNumbers.add(null);

        long grade = -1;
        Long longGrade = 2L;
        longGrade = null;

        String name = null;

        List<Long> numbers;

        // String will be student's name
        //List<Long> will be student's grade
        Map<String, List<Long>> studentGrades = new HashMap<>();
        String john = "John";
        List<Long> johnsGrades = new ArrayList<>();
        johnsGrades.add(5L);
        johnsGrades.add(1L);

        List<Long> anotherListOfGrades = new ArrayList<>();
        anotherListOfGrades.add(3L);

        studentGrades.put(john, johnsGrades);
        System.out.println("after adding John to map: " + studentGrades);
        studentGrades.put(john, anotherListOfGrades);
        System.out.println("after reassigning John inside map: " + studentGrades);


        Person me = new Person("Inga", "V.");
        me = new Person("Inga", "M.");

        Map<String, String> namesAndSurnames = new HashMap<>();
        namesAndSurnames.put("Ramune", "LTU");
        System.out.println("Ramune's surname: " + namesAndSurnames.get("Ramune"));


    }
}

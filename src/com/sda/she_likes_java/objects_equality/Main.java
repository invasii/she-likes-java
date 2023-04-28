package com.sda.she_likes_java.objects_equality;

public class Main {
    public static void main(String[] args) {
        int a = 5, b = 10;
        int c = 5;

        System.out.println("are a and b equal: " + (a == b)); //== operator is checking if values are equal
        System.out.println("are a and c equal: " + (a == c)); // the values is the same

        String name1 = new String("Inga");
        String name2 = new String("Inga");
        System.out.println("name1 == name2: " + (name1 == name2));
        String name3 = name2;
        System.out.println("name3 == name2: " + (name3 == name2));

        Person first = new Person("dalia", "Tidikaite", 29);
        Person second = new Person("dalia", "Tidikaite", 29);
        Person third = second;

// two different objects (above), because its like separate objects, == works differently for the numbers as comparing the value
// however for string (primitive data types - variables) - it considers as two different objects, compares its objects
        System.out.println("first == second: " + (first == second));
        System.out.println("first is equal to second: " + (first.equals((second))));
        System.out.println("third is equal to second: " + (third.equals((second))));
    }
}

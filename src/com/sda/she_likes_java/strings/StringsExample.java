package com.sda.she_likes_java.strings;

public class StringsExample {
    public static void main(String[] args) {
        String name = "Inga";
        String surname = "Vasiliauskaite";
        int age = 30;

        // Hi, I'm (name) (surname). I am (age) old.

        System.out.println("Hi, I'm " + name + " " + surname + ". " + "I am " + age + " years old. ");

        // %s means String wildcard, from C++
        // %d means number wildcard, from C++
        System.out.println(String.format("Hi, I'm %s %s. I am %d years old.",name, surname, age));
        System.out.println("Hi, I'm %s %s. I am %d years old.".formatted(name, surname, age));
    }
}

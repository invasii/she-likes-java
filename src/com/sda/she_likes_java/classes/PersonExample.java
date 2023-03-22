package com.sda.she_likes_java.classes;

public class PersonExample {

    public static void main(String[] args) {
        System.out.println("Let's use our newly created class Person");

        // primitive variables
        int number = 1;
        String name = "inga";

        // object variables (in this case me is object variable)
        // me is reference to object
        Person me = new Person();
        me.name = "Inga";
        Person you = new Person();
        you.name = "Tomas";

        System.out.println("My name currently is: " + me.name);
        System.out.println("Your name currently is: " + you.name);
    }
}

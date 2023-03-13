package com.sda.she_likes_java.functions;

public class FunctionsFirstExample {
    public static void main(String[] args) {
        // function is a piece of the code which I can call many times
        // function features:
        // function has name - just before opening bracket like "name"
        // function has parameters - inside brackets:String[] args
        // function has return value - type name before name of the function e.g. void
        // void means no return
        // we call function by its name
        printMyName();

        System.out.println();
        System.out.println("After call...");
        System.out.println();

        printMyName();
    }

    public static void printMyName() {
        int numberOfTimes = 10;
        while (numberOfTimes >0) {
            System.out.println("Hi, I'm Inga");
            numberOfTimes--;
        }
    }


}

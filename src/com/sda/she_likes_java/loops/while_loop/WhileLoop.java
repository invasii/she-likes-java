package com.sda.she_likes_java.loops.while_loop;

public class WhileLoop {
    public static void main(String[] args) {
        // how to make our calculation in a loop
        System.out.println("I'm here");
        System.out.println("I'm here");
        System.out.println("I'm here");

        // while loop is going to be executed ONLY when condition is true
        // the body of while loop is going to be repeated as many times as condition is true

        boolean condition = false;
        while (condition) {
            System.out.println("Java forever");
        }

        int numberOfTrials = 5;
        while (numberOfTrials > 0) {
            System.out.println("I'm working");
            // first right part of th question is evaluated and assigned to variable
            numberOfTrials = numberOfTrials - 1;
            if (numberOfTrials % 2 == 1) { // printing just odd numbers. If you divide the number to 2 and remainder is 1
                System.out.println("Current value of numberOfTrials: " + numberOfTrials);
            }
        }

        System.out.println("The End.");
    }

}

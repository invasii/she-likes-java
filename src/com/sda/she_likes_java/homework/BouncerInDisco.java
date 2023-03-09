package com.sda.she_likes_java.homework;

import java.util.Scanner;

public class BouncerInDisco {
    public static void main(String[] args) {
        System.out.println("\nBouncer In Disco");

        Scanner inputReader = new Scanner(System.in);
        System.out.println("\nTell me how old are you?");
        int personAge = inputReader.nextInt();

        if (personAge >= 16) {
            System.out.println("That is nice. Well, lets see if you tall enough");
        } else {
            System.out.println("You way too young, we need to check your height as well");
        }

        System.out.println("\n\nTell me what is your height?");
        Float personHeight = inputReader.nextFloat();

        if (personHeight >= 1.60) {
            System.out.println("Welcome to the disco!");
        } else {
            System.out.println("See you next time little creature!");
        }






    }
}

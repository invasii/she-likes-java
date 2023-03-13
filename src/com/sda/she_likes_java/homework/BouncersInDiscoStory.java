package com.sda.she_likes_java.homework;

import java.util.Objects;
import java.util.Scanner;

public class BouncersInDiscoStory {
    public static void main(String[] args) {

        System.out.println("\nDisco bouncer story starts");
        System.out.println("Hi, how old are You? ");

        Scanner inputReader = new Scanner(System.in);
        // String declineMessage = " Sorry, go home...";

        int age = inputReader.nextInt();
        System.out.println("Ok. What is your height?");
        int height = inputReader.nextInt();
        // System.out.println("Looks like you grown-up.");
        System.out.println("But can you sing well?");
        Scanner inputReader2 = new Scanner(System.in);
        String canSing = inputReader2.nextLine();

        boolean isAllowedToParty = age >= 20 && height >= 150 && Objects.equals(canSing, "yes");
        if (isAllowedToParty) {
            System.out.println("Have a great time at the party !");
        } else {
            System.out.println("Maybe next time!! :)) ");
        }

        System.out.println("\nDisco bouncer story continues for old ones");
        System.out.println("\nHi, how old are You? ");

        int age2 = inputReader.nextInt();
        System.out.println("Thank you. What is your height?");
        int height2 = inputReader.nextInt();
        // System.out.println("Looks like you grown-up.");
        System.out.println("Can you sing?");
        Scanner inputReader3 = new Scanner(System.in);
        String ableToSing = inputReader3.nextLine();

        boolean isOldEnoughToParty = age2 >= 50 || height >= 150 || Objects.equals(ableToSing, "yes");
        if (!isOldEnoughToParty) {
            System.out.println("Have a great time at the party !");
        } else {
            System.out.println("Maybe next time");
        }

        System.out.println("\nSomebody is still wants to join the party");
        System.out.println("\nCan you tell me how old are You? ");
        int age3 = inputReader.nextInt();

        if (age3 >= 20) {
            System.out.println("Ok, so You're adult:)");
            System.out.println("Let me know Your height: ");
            int height3 = inputReader.nextInt();
            if (height >= 150) {
                System.out.println("Great!!!! Welcome to the party:)");
            } else if (age3 >=20 && height3 >= 150) {
                System.out.println("Welcome to the party:)");
            }
        } else {
            System.out.println("Sorry go home");
        }

    }
}



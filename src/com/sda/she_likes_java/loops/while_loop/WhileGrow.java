package com.sda.she_likes_java.loops.while_loop;

public class WhileGrow {
    public static void main(String[] args) {
        int ageOfTheKid = 1;

        while (ageOfTheKid <= 18) {
            System.out.println("Mommy, can I go to the disco?");
            System.out.println("No.");

           // ageOfTheKid = ageOfTheKid + 1 the same can be written ageOfTheKid++
            ageOfTheKid++;
        }

        System.out.println("Go to the party!");

    }
}

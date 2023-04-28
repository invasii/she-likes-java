package com.sda.she_likes_java.homework.exercise21;

public class Submarine extends Vehicle implements Diving{
    @Override
    public void dive() {
        System.out.println("Submarine is always diving under the water");
    }
}

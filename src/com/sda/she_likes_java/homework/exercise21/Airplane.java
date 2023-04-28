package com.sda.she_likes_java.homework.exercise21;

public class Airplane extends Vehicle implements Flying {
    @Override
    public void fly() {
        System.out.println("Airplane is kind of vehicle and its flying");
    }
}

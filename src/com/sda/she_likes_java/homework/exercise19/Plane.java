package com.sda.she_likes_java.homework.exercise19;

public class Plane extends Vehicle{
    @Override
    public void movementType(){
        System.out.println("Plane is the fastest way to travel between European capitals");
    }
    public void flyUnderBridge() {
        System.out.println("pilot flies under the bridge");
    }
    public void planePerks() {
        System.out.println("Plane offers 1st class snacks today for free");
    }
}


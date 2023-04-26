package com.sda.she_likes_java.homework.exercise19;

public class Main {
    public static void main(String[] args) {
        Vehicle vehicleParent = new Vehicle(); // introducing parent
        vehicleParent.movementType();
        boolean b = vehicleParent != null;
        Vehicle plane = new Plane(); // up-casting child
        plane.movementType();
        Vehicle ship = new Ship(); // up-casting child
        ship.movementType();
        System.out.println("as well as the plane can offer some perks");
        Vehicle plane2 = new Plane();
        Plane planeWithPerks = (Plane) plane2;
        planeWithPerks.flyUnderBridge();
        System.out.println("even more!!!");
        planeWithPerks.planePerks();
        System.out.println("Who loves flying?");
        System.out.println("Ok, ship trips can also be fun with a good Captain");
        Vehicle betterShip = new Ship();
        Ship onDeckDiscoShip = (Ship) betterShip;
        onDeckDiscoShip.shipPerks();
        boolean isAllowedToTravel = vehicleParent != null;
        if (isAllowedToTravel) {
            System.out.println("Bon voyage!");
        } else {
            System.out.println("sorry your passport is not valid");
        }
    }
}


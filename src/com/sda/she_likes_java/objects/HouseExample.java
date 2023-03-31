package com.sda.she_likes_java.objects;

public class HouseExample {

    public static void main(String[] args) {
        House myHouse = new House(4, 2);
        System.out.println("I've got a new house: " + myHouse);

        System.out.println("Currently my house has got: " + myHouse.getNumberOfRooms() + " rooms");
        System.out.println("I need more rooms");
        myHouse.setNumberOfRooms(5);

        System.out.println("I've got more rooms now.");
        System.out.println("Currently my house has got: " + myHouse.getNumberOfRooms() + " rooms");
    }
}

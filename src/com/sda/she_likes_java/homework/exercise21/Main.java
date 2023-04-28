package com.sda.she_likes_java.homework.exercise21;



public class Main {
    public static void main(String[] args) {

        Vehicle airplane = new Airplane();
        ((Airplane) airplane).fly();

        Vehicle ship = new Ship();
        ((Ship) ship).floats();

        Vehicle submarine = new Submarine();
        ((Submarine) submarine).dive();
    }

}

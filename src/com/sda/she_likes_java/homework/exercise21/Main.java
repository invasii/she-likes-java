package com.sda.she_likes_java.homework.exercise21;



public class Main {
    public static void main(String[] args) {

        Vehicle airplane = new Airplane(); // this is called casting = new Airplane (what is in ship or in higher hierarchy - vehicle in this case)
       // every class is from object and object is the highest hierarchy (in this case new object is Airplane
        airplane.move();
        ((Airplane) airplane).fly(); // here is casting also

        Vehicle ship = new Ship();
        ship.move();
        ((Ship) ship).floats();

        Vehicle submarine = new Submarine();
        submarine.move();
        ((Submarine) submarine).dive();
    }

}

package com.sda.she_likes_java.common_behaviour;

public class Main {
    public static void main(String[] args) {
        Bird bird = new Bird();
     //   bird.fly();

        Animal tiger = new Tiger();
        tiger.go();

        Bird parrot = new Parrot();
        Bird ostrich = new Ostrich();

        Flyable superman = new Superman();
        Flyable flyableParrot = new Parrot();

        Swimmable tiger2 = (Swimmable) tiger; // these two lines means the same
        Swimmable swimmableTiger = new Tiger(); //these two lines means the same

        Superman superSuperman = new Superman();
        Flyable superFly = superSuperman;
        Swimmable superSwim = superSuperman;

        //Tiger assignment ways
        Tiger newTiger = new Tiger();
        newTiger.go();
        newTiger.swim();

        Animal animalTiger = new Tiger();
        animalTiger.go();

        Swimmable swimmableTiger2 = new Tiger();
        swimmableTiger2.swim();

        Object objectTiger = new Tiger();
        // cannot call go() and swim() they are not visible here (in tiger object)
    }
}

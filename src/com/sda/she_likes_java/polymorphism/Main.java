package com.sda.she_likes_java.polymorphism;

public class Main {
    public static void main(String[] args) {
        Animal someAnimal = new Animal();
        Cat myCat = new Cat();
        Animal secondCat = new Cat();
        Animal dog = new Dog();
        dog.makeSound();

        callAnimal(someAnimal);
        callAnimal(myCat);
        callAnimal(dog);

        callAnimal(new Elephant());
        // this line above is like a shortcut for:
        //Elephant elephant = Elephant();
        //callAnimal(new Elephant());
        //callAnimal(elephant);

        Object anotherCat = new Cat();

        Animal animalCat = new Cat();
        Cat thirdcat = new Cat();
    }
    public static void callAnimal(Animal animal) {
        animal.makeSound();
    }
    public static void callAnimal(Cat animal) {
        animal.makeSound();
    }
    public static void callAnimal(Dog animal) {
        animal.makeSound();
    }
    public static void callAnimal(Elephant animal) {
        animal.makeSound();
    }
}

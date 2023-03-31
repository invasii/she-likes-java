package com.sda.she_likes_java.classes.exercise_16;

public class Animal {
    public String firstName;
    public String breed;
    public String age;

    public Animal(String firstName, String breed, String age) {
        this.firstName = firstName;
        this.breed = breed;
        this.age = age;
    }

    public Animal() {
    }

    @Override
    public String toString() {
        return "Animal{" +
                "firstName='" + firstName + '\'' +
                ", breed='" + breed + '\'' +
                ", age='" + age + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Animal someAnimal = new Animal();
        someAnimal.firstName = "Lokai";
        someAnimal.breed = "Eclipse";
        someAnimal.age = "8";
        System.out.println("Animal data indicated: " + someAnimal);


        Animal animalWithConstructor = new Animal("Beris", "Moon", "12");
        System.out.println("Animal data indicated with constructor: " + animalWithConstructor);

    }



}

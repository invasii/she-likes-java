package com.sda.she_likes_java.virtual_methods;

public class Main {

    public static void main(String[] args) {
        Mammal human = new Human();
        human.whoYouAre();

        Human noHuman = null;
      //  noHuman.whoYouAre(); these lines wont work, as the name of the reference is null

        HumanLife humanLife = new HumanLife();
        humanLife.tellMeWhoYouAre(null);

        Woman woman = new Woman();
        humanLife.tellMeWhoYouAre(woman);

        Man man = new Man();
        humanLife.tellMeWhoYouAre(man);


        System.out.println("Casting objects");
        Human anotherWoman = new Woman();
        Woman castedFromHuman = (Woman) anotherWoman;
        castedFromHuman.learnJava();
        Man manForSure = new Man();
        Human anotherMan = new Man();
        humanLife.tryToCastHumanToMan(anotherMan);
        humanLife.tryToCastHumanToMan(new Man());
        humanLife.tryToCastHumanToMan(new Woman());
    }
}

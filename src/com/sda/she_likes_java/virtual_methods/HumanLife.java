package com.sda.she_likes_java.virtual_methods;

public class HumanLife {

    public void tellMeWhoYouAre(Human human) {
        if (human != null) {

            human.whoYouAre();
        }
    }

    public void tryToCastHumanToMan(Human maybeWomanOrMan) {

        if (maybeWomanOrMan instanceof Man) {
            System.out.println("It's a monster");
            (
                    (Man) maybeWomanOrMan
            ).learnToCleanHouse();
        }
        // instanceof operator - tests if argument is of given type (if its a man or a woman as an example)
        // instanceof gives us a boolean results
        // casting or down casting - is like changing from generic to more specific
        // casting is for references
        // necessary to specify methods

        if (maybeWomanOrMan instanceof Woman) {
            System.out.println("It's a woman");
            ((Woman) maybeWomanOrMan).learnJava();
        }
    }
}

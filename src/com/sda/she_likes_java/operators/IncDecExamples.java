package com.sda.she_likes_java.operators;

public class IncDecExamples {
    public static void main(String[] args) {
        int one = 10;
        int two = 10;

        one++; // postincrementation -> pluses after the variable
        two--; // postdecrementation -> minuses after the variable

        System.out.println("one value is: " + one);
        System.out.println("two value is: " + two);

        ++one; //preicrementation -> pluses before the variable
        --two; // predecrementation -> minuses before the variable

        System.out.println("one value is: " + one);
        System.out.println("two value is: " + two);

        int three = ++one;
        System.out.println("one value is: " + one);
        System.out.println("three should have value of 13, current value of it is: " + three);

        System.out.println("Incrementation explanation.");
        int four = one++;
        System.out.println("one value is: " + one);
        System.out.println("postincrementation is going to assign to four of current value of one and later "
        + "is going to increase value of one");
        System.out.println("four value is: " + four);

        four = ++one;
        System.out.println("one value is: " + one);
        System.out.println("four value is: " + four);
        System.out.println("postincrementation - first we use increment, later use new value in assignment expression");

    }
}

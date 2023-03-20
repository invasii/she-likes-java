package com.sda.she_likes_java.loops.for_loop;

public class ForLoopExample {
    public static void main(String[] args) {

        for (
                int number = 0; //initialization part - executed only once
                number < 100; // condition of the loop
                number++ // executed as last instruction in current interation
        ) {
            System.out.println("number value is:" + number);
        }

        // the same loop but with while, also it counts from 1 to 100 as well as we increasing first before printing
        int number = 0;
        while (number < 100) {
            number++;
            System.out.println("number value is: " + number);

        }
    }
}

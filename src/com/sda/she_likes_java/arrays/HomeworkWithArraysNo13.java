package com.sda.she_likes_java.arrays;

import java.util.Arrays;

public class HomeworkWithArraysNo13 {
    public static void main(String[] args) {
        // create an int array with 100 elements
        int[] numbers = new int[100];

        //initialization phase
        //first index is: 0
        // last index is (nuber.length) -

        for (int i = 1; i < numbers.length; i++) {
            System.out.println("Current value i is: " + i);
            numbers[i] = 3 * i;
            // numbers[i - 1]
        }
       //read data

        for(int i = numbers.length - 1; i > -1; i--) {
            System.out.println("number[" + i + "] = " + numbers[i]);
        }
    }
}

package com.sda.she_likes_java.arrays;

import java.util.Random;

public class EnglishSchoolGrades {
    /* - opening part of multiline comment

    closing part of multiline comment */

    public static void main(String[] args) {
        int[] myGradesOnEnglishClass = new int[100];

        Random gradeGenerator = new Random();

        // first for is needed to initialize with some random scores
        for (int index = 0; index < myGradesOnEnglishClass.length; index++) {
            myGradesOnEnglishClass[index] = 1 + gradeGenerator.nextInt(6);

        }
        for (int index = 0; index < myGradesOnEnglishClass.length; index++) {
            System.out.println("my grade on index number: " + index + " is: " + myGradesOnEnglishClass[index]);
        }
    }
}

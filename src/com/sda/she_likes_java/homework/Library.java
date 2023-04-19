package com.sda.she_likes_java.homework;

import java.util.Random;

public class Library {

        static String author;
        static String title;
        static int yearOfPublication;

    public Library(String author, String title, int yearOfPublication) {

        Library firstLibrary = new Library();
        Library.author = "Jack Jones";
        Library.title = "Black sea";
        Library.yearOfPublication = 2005;

        Library secondLibrary = new Library();
        Library.author = "Mary Jane";
        Library.title = "Meeting minutes";
        Library.yearOfPublication = 2020;

        Library thirdLibrary = new Library();
        Library.author = "Jake Olsen";
        Library.title = "What to know?";
        Library.yearOfPublication = 2019;

        System.out.println("There are three different books in the library");
        Random numberGenerator = new Random();
        int someRandomNumber = numberGenerator.nextInt(25);



    }

}

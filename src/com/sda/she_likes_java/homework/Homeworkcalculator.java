package com.sda.she_likes_java.homework;
//packages use reverse domain names

import java.util.Scanner;

public class Homeworkcalculator {
    public static void main(String[] args) {
        System.out.println("Homework task - Calculator with 4 operations");
        System.out.println("Calculating addition + ");
        System.out.println("\n\nPlease provide first number: ");
        int firstNumber;
        int secondNumber;
        Scanner inputReader = new Scanner(System.in);
        firstNumber = inputReader.nextInt();
        System.out.println("You provided first number: " + firstNumber);
        System.out.println("\n\nPlease provide second number: ");
        secondNumber = inputReader.nextInt();
        System.out.println("You provided second number: " + secondNumber);
        int sum = firstNumber + secondNumber;
        System.out.println("Sum is: " + sum);

        System.out.println("\n\nCalculating substraction - ");
        System.out.println("Please provide first number: ");
        firstNumber = inputReader.nextInt();
        System.out.println("You provided first number: " + firstNumber);
        System.out.println("Please provide second number: ");
        secondNumber = inputReader.nextInt();
        System.out.println("You provided second number: " + secondNumber);
        int difference = firstNumber - secondNumber;
        System.out.println("Substraction is: " + difference);

        System.out.println("\n\nCalculating multiplication * ");
        System.out.println("Please provide first number: ");
        firstNumber = inputReader.nextInt();
        System.out.println("You provided first number: " + firstNumber);
        System.out.println("Please provide second number: ");
        secondNumber = inputReader.nextInt();
        System.out.println("You provided second number: " + secondNumber);
        int product = firstNumber * secondNumber;
        System.out.println("Multiplication is: " + product);

        System.out.println("\n\nCalculating division / ");
        System.out.println("Please provide first number: ");
        firstNumber = inputReader.nextInt();
        System.out.println("You provided first number: " + firstNumber);
        System.out.println("Please provide second number: ");
        secondNumber = inputReader.nextInt();
        System.out.println("You provided second number: " + secondNumber);
        int quotient = firstNumber / secondNumber;
        System.out.println("Division is: " + quotient);

        // \n means - put a new line her
        //e.g. System.out.println("\n\nPlease provide second number: ");


    }
}

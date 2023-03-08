package com.sda.she_likes_java.homework;
//packages use reverse domain names
import java.util.Scanner;

public class Homeworkcalculator {
    public static void main(String[] args) {
        System.out.println("Homework task - Calculator with 4 operations");
        System.out.println("Calculating addition + ");
        System.out.println("Please provide first number: ");
        int firstNumber;
        int secondNumber;
        Scanner inputReader = new Scanner(System.in);
        firstNumber = inputReader.nextInt();
        System.out.println("You provided first number: " + firstNumber);
        System.out.println("Please provide second number: ");
        secondNumber = inputReader.nextInt();
        System.out.println("You provided second number: " + secondNumber);
        int sum = firstNumber + secondNumber;
        System.out.println("Sum is: " + sum);

        System.out.println("Calculating substraction - ");
        System.out.println("Please provide first number: ");
        Scanner inputR = new Scanner(System.in);
        firstNumber = inputR.nextInt();
        System.out.println("You provided first number: " + firstNumber);
        System.out.println("Please provide second number: ");
        secondNumber = inputR.nextInt();
        System.out.println("You provided second number: " + secondNumber);
        int difference = firstNumber - secondNumber;
        System.out.println("Substraction is: " + difference);

        System.out.println("Calculating multiplication * ");
        System.out.println("Please provide first number: ");
        Scanner inputobj = new Scanner(System.in);
        firstNumber = inputobj.nextInt();
        System.out.println("You provided first number: " + firstNumber);
        System.out.println("Please provide second number: ");
        secondNumber = inputR.nextInt();
        System.out.println("You provided second number: " + secondNumber);
        int product = firstNumber * secondNumber;
        System.out.println("Multiplication is: " + product);

        System.out.println("Calculating division / ");
        System.out.println("Please provide first number: ");
        Scanner inputobject = new Scanner(System.in);
        firstNumber = inputobject.nextInt();
        System.out.println("You provided first number: " + firstNumber);
        System.out.println("Please provide second number: ");
        secondNumber = inputR.nextInt();
        System.out.println("You provided second number: " + secondNumber);
        int quotient = firstNumber / secondNumber;
        System.out.println("Division is: " + quotient);





    }
}

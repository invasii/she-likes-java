import java.sql.SQLOutput;
import java.util.Scanner;

public class Calculator {
    //psvm (public static void main line appears) - not so magic shortcut
    public static void main(String[] args) {
        System.out.println("Calculator...");
        System.out.println("Calculating sum of two com.sda.she_likes_java.homework.numbers ");
        System.out.println("Provide first number: ");
        int firstNumber;
        int secondNumber;
        // TODO:explain object creation
        Scanner inputReader = new Scanner(System.in);
        firstNumber = inputReader.nextInt();
        System.out.println("You provided number: " + firstNumber);
        System.out.println("Provide second number: ");
        secondNumber = inputReader.nextInt();
        System.out.println("You provided number: " + secondNumber);
        int sum = firstNumber + secondNumber;
        System.out.println("Sum is: " + sum);


    }
}

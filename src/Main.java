public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        //10000 its number literal, direct value (just value)
        System.out.println(100000);

        //Variable:
        //is a holder for data
        //needs a good name e.g. myDaughterAge
        //needs type of variable
        //that data type limit possible set of allowed values
        //int - integer number
        int myDaughterAge = 5;

        //assigning a new value to variable
        myDaughterAge = 6;
        //sout + enter
        System.out.println(myDaughterAge);

        // use camel case starting with lower letter
        // String type is for words and letters (numbers also considered as letters)
        String myName = "Inga";
        String mySurname = "Vasiliauskaite";
        System.out.println(myName + " " + mySurname);

        String five = "5";
        String otherFive = "5";
        System.out.println(five + otherFive);

        //true or false
        boolean trueValue = true;
        trueValue = false;

        System.out.println(trueValue);

        //11.0
        int eleven = 11;

        //double type for number with fraction part
        double truEleven = 11.0;

        System.out.println("Exercise 7 ");
        int sum = 5+8;
        System.out.println("Sum of 5 and 8 is = " + sum);

        int difference = 11 - 4;
        System.out.println("Difference of 11 and 4 is: " + difference);

        int product = 5*8;
        System.out.println("Product of 5 and 8 is: " + product);

        double quotient = 5.0/8.5;
        System.out.println("Quotient of 5.0 and 8.5 is: " + quotient);

        //Lesson 4
        //First we divide, we have two 4 in the 9
        System.out.println("Reminder");
        int result = 9/4;
        System.out.println("result is: " + result);

        //modulo operator - shows what is left after diving 9/4 (which is 1) by using % sign
        result = 9%4;
        System.out.println("and now result is: " + result);












    }

}
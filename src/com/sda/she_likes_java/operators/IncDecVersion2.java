package com.sda.she_likes_java.operators;

public class IncDecVersion2 {
    public static void main(String[] args) {
        System.out.println("Postincrementation");
        int age = 17;

        boolean isAdult = age >= 18;
        System.out.println("isAdult value: " + isAdult);

        isAdult = age++ >= 18; //this line says that age which is 17 was used and after that increased by 1 (++),
        //so isAdult value is false, because is still was not as
        System.out.println("isAdult value: " + isAdult);
        System.out.println("age is: " + age);
        System.out.println("age is: " + age++);
        System.out.println("age is: " + age++);



        System.out.println("Preincrementation");
        age = 17;

        System.out.println("isAdult value: " + isAdult);

        isAdult = ++age >= 18;
        System.out.println("isAdult value: " + isAdult);
        System.out.println("age is: " + age);



    }
}

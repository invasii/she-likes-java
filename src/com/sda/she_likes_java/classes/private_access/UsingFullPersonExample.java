package com.sda.she_likes_java.classes.private_access;

import com.sda.she_likes_java.classes.constructor.FullPerson;

public class UsingFullPersonExample {

    public static void main(String[] args) {
        FullPerson maybeMe = new FullPerson("Ingulis", "Vasik", 35, null);
   // maybeMe.age = 1;
        System.out.println("My age: " + maybeMe.getAge());
        System.out.println("me before age decreasing: " + maybeMe);
        maybeMe.setAge(-1);
        System.out.println("me after failed trial to decrease age: " + maybeMe);
    }
}

package com.sda.she_likes_java.classes;

public class ParentClass {
    String firstName;
    String surname;
    Person firstChild;
    Person secondChild;

    Address address;

    public static void main(String[] args) {
        Address someAddress = new Address();
        someAddress.country = "Lithuania";
    }
}

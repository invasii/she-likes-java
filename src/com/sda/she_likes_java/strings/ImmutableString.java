package com.sda.she_likes_java.strings;

public class ImmutableString {

    public static void main(String[] args) {
        String name = "Inga";
        name = name.concat(" Vasiliauskaite"); // + is a shortcut for contact method call, concat meaning that
        // the content will be ignored, so in this case - console only show name and no surname and age
        name = name.concat("she is 30");

        System.out.println("My name now: " + name);

        StringBuilder nameWithBuilder = new StringBuilder("Inga"); // stringbuilder stores everything in one object, its due to memory saving
        nameWithBuilder.append(" Vasiliauskaite");
        System.out.println("Name with builder: " + nameWithBuilder);

        String some = "Alice " + " is" + " 10" + " years";
        // "Alice is" + " 10" + " years"
        // "Alice is 10" + years"
        // Alice is 10 years

        String alice = "Alice ";
        StringBuilder someString = new StringBuilder();
        someString.append("Alice");
        someString.append("is");
        someString.append("10");
        someString.append("years");
    }
}

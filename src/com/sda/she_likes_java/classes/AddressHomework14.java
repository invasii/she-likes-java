package com.sda.she_likes_java.classes;

public class AddressHomework14 {
    public static void main(String[] args) {
        System.out.println("My address information using classes");

        Address one = new Address();
        one.country = "Lithuania";
        Address two = new Address();
        two.city = "Kaunas";
        Address three = new Address();
        three.street = "Virbeliskiu st.";
        Address four = new Address();
        four.postalCode = 11111;

        System.out.println("My current address is: \n"+ one.country + ", \n" + two.city + ", \n" + three.street + ",\n" + four.postalCode);


        System.out.println("\nMy work address using classes");
        Address five = new Address();
        five.country = "Belgium";
        Address six = new Address();
        six.city = "Antwerp";
        Address seven = new Address();
        seven.street = "Unkown ave.";
        Address eight = new Address();
        eight.postalCode = 55555;

        System.out.println(String.format("My  work address is: %s, %s, %s, %d. ",five.country, six.city, seven.street, eight.postalCode));

    }
}

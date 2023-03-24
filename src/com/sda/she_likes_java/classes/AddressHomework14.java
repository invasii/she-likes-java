package com.sda.she_likes_java.classes;

public class AddressHomework14 {
    public static void main(String[] args) {
        System.out.println("My address information using classes");

        Address addressHome  = new Address();
        addressHome.country = "Lithuania";
        addressHome.city = "Kaunas";
        addressHome.street = "Virbeliskiu st.";
        addressHome.postalCode = 11111;

        System.out.println("My current address is: \n"+ addressHome.country + ", \n" + addressHome.city + ", \n" + addressHome.street + ",\n" + addressHome.postalCode);


        System.out.println("\nMy work address using classes");
        Address workAddress = new Address();
        workAddress.country = "Belgium";
        workAddress.city = "Antwerp";
        workAddress.street = "Unkown ave.";
        workAddress.postalCode = 55555;

        System.out.println(String.format("My  work address is: %s, %s, %s, %d. ",workAddress.country, workAddress.city, workAddress.street, workAddress.postalCode));

    }
}

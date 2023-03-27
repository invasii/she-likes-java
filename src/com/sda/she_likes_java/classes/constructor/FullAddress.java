package com.sda.she_likes_java.classes.constructor;

public class FullAddress {
    public String country;
    public String city;
    public String street;
    public String postalCode;

    // constructor
    public FullAddress(String country, String city, String street, String postalCode) {
        this.country = country;
        this.city = city;
        this.street = street;
        this.postalCode = postalCode;
    }

     //default constructor means - without any parameters
    public FullAddress() {
    }

    @Override
    public String toString() {
        return "FullAddress{" +
                "country='" + country + '\'' +
                ", city='" + city + '\'' +
                ", street='" + street + '\'' +
                ", postalCode='" + postalCode + '\'' +
                '}';
    }

    public static void main(String[] args) {
        // full address
        FullAddress myAddress = new FullAddress();
        myAddress.city = "Vilnius";
        myAddress.country = "Lithuania";
        myAddress.street = "Unknown st.";
        myAddress.postalCode = "0555";
        System.out.println("FullAddress created by hand: " + myAddress);


        FullAddress createWithFullConstructor = new FullAddress("Spain", "Barcelona", "Lalal st.", "25253");
        System.out.println("Full address created with constructor: " + createWithFullConstructor);

    }
}

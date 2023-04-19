package com.sda.she_likes_java.visibility.private_modifer.main;

import com.sda.she_likes_java.visibility.private_modifer.cars.Car;

public class Main {
    public static void main(String[] args) {
        Car funnyCar = new Car();

        // brand is private - so it is not visible outside the class
        //funnyCar.brand
        funnyCar.model = "corolla";

        // cannot see color from outside its class package (as its indicated as private=not indicated as public)
        // funnyCar.colour = "pink";

    }
}

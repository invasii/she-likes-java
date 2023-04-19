package com.sda.she_likes_java.visibility.private_modifer.cars;
//its not possible to mark the class as private
 public class Car {
    private String brand;
    public String model;
    String colour;


    public String getBrand() {
        return brand;
    }

    void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", colour='" + colour + '\'' +
                '}';
    }
}

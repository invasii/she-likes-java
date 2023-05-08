package com.sda.she_likes_java.collections;

import java.util.Objects;

public class Trousers {
    private final String material;
    private final String brand;

    public Trousers(String material, String brand) {  //the constructor
        this.material = material;
        this.brand = brand;
    }

    public String getMaterial() {
        return material;
    }

    public String getBrand() {
        return brand;
    }

    @Override  // from the generator - equals
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Trousers trousers = (Trousers) o;
        return material.equals(trousers.material) && brand.equals(trousers.brand);
    }

    @Override  // from the generator - hashcode
    public int hashCode() {
        return Objects.hash(material, brand);
    }

    @Override
    public String toString() {
        return "Trousers{" +
                "material='" + material + '\'' +
                ", brand='" + brand + '\'' +
                '}';
    }
}

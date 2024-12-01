package org.example;

public class BMW implements Car, Loggable, Asset, Property {

    public void drive() {
        System.out.println("BMW driving");
    }

    public int value() {
        return 800;
    }

    public String owner() {
        return "Adilet";
    }

    public String message() {
        return "I am the car of Adilet";
    }
}

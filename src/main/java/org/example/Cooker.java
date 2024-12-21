package org.example;

public class Cooker extends Employee implements Cookable {
    public Cooker(String name) {
        super(name);
    }

    @Override
    public void cook() {
        System.out.println("Готовлю");
    }
}

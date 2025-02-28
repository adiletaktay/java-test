package org.example.tasks;

public class Laptop implements Computer {
    @Override
    public void turnOn() {
        System.out.println("Ноутбук включен.");
    }

    @Override
    public void turnOff() {
        System.out.println("Ноутбук выключен.");
    }

    @Override
    public void reset() {
        System.out.println("Ноутбук сброшен.");
    }
}

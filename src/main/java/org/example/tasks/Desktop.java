package org.example.tasks;

public class Desktop implements Computer {
    @Override
    public void turnOn() {
        System.out.println("Настольный компьютер включен.");
    }

    @Override
    public void turnOff() {
        System.out.println("Настольный компьютер выключен.");
    }

    @Override
    public void reset() {
        System.out.println("Настольный компьютер сброшен.");
    }
}
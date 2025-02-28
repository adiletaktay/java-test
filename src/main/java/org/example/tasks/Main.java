package org.example.tasks;

public class Main {
    public static void main(String[] args) {
        Computer desktop = new Desktop();
        Computer laptop = new Laptop();

        desktop.turnOn();
        desktop.reset();
        desktop.turnOff();

        laptop.turnOn();
        laptop.reset();
        laptop.turnOff();
    }
}

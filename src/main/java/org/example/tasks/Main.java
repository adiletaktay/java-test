package org.example.tasks;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();

        car.pressGas();

        car.startEngine();
        car.shiftUp();

        car.pressGas();
        car.shiftUp();
        car.pressGas();

        car.stopCar();
    }
}

package org.example.tasks;

public class Garage<T extends Car> {
    private T parkedCar;
    private int blackCarCount = 0;

    public void parkCar(T car) {
        this.parkedCar = car;
        if (car.isBlack()) {
            blackCarCount++;
        }
    }

    public int getBlackCarCount() {
        return blackCarCount;
    }

    @Override
    public String toString() {
        return "Parked " + (parkedCar != null ? parkedCar.toString() : "No car parked") + ", Black cars: " + blackCarCount;
    }
}

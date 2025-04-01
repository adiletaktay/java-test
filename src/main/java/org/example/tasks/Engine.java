package org.example.tasks;

import java.io.Serializable;

public class Engine implements Serializable {
    private double volume;
    private String serialNumber;

    public Engine(double volume, String serialNumber) {
        this.volume = volume;
        this.serialNumber = serialNumber;
    }

    public double getVolume() {
        return volume;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "volume=" + volume +
                ", serialNumber='" + serialNumber + '\'' +
                '}';
    }
}

package org.example.tasks;

import java.io.Serializable;

public class Motorcycle implements Serializable {
    public String brand;
    private String model;
    private Engine engine;

    public Motorcycle(String brand, String model, Engine engine) {
        this.brand = brand;
        this.model = model;
        this.engine = engine;
    }

    public String getModel() {
        return model;
    }

    public Engine getEngine() {
        return engine;
    }

    @Override
    public String toString() {
        return "Motorcycle{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", engine=" + engine +
                '}';
    }
}

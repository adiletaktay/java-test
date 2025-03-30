package org.example.tasks;

public class Car {
    private String model;
    private String manufacturer;
    private boolean isElectric;

    public Car(String model, String manufacturer, boolean isElectric) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.isElectric = isElectric;
    }

    public boolean isElectric() {
        return isElectric;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getModel() {
        return model;
    }

    @Override
    public String toString() {
        return model;
    }
}

package org.example;

public class Car {

    private String owner;
    private String manufacturer;
    private String color;
    private Engine engine;

    public Car(String owner, String manufacturer, String color) {
        this.owner = owner;
        this.manufacturer = manufacturer;
        this.color = color;
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj) {
            return true;
        }
        if(obj == null) {
            return false;
        }
        if(getClass() != obj.getClass()) {
            return false;
        }
        Car other = (Car) obj;

        if (!manufacturer.equals(other.manufacturer)) {
            return false;
        }
        if (!engine.equals(other.engine)) {
            return false;
        }
        if (!color.equals(other.color)) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + manufacturer.hashCode();
        result = 31 * result + engine.hashCode();
        return 31 * result + color.hashCode();
    }
}

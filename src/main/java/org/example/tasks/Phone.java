package org.example.tasks;

public class Phone {
    private String name;
    private String manufacturer;

    public Phone(String name, String manufacturer) {
        this.name = name;
        this.manufacturer = manufacturer;
    }

    public String getName() {
        return name;
    }

    public String getManufacturer() {
        return manufacturer;
    }
}

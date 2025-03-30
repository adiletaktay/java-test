package org.example.tasks;

import java.util.List;

public class Country {
    private String name;
    private List<City> cities;

    public Country(String name, List<City> cities) {
        this.name = name;
        this.cities = cities;
    }

    public List<City> getCities() {
        return cities;
    }
}

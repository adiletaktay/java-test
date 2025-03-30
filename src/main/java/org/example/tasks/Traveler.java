package org.example.tasks;

import java.util.List;

public class Traveler {
    private String name;
    private List<Country> visitedCountries;

    public Traveler(String name, List<Country> visitedCountries) {
        this.name = name;
        this.visitedCountries = visitedCountries;
    }

    public List<Country> getVisitedCountries() {
        return visitedCountries;
    }
}

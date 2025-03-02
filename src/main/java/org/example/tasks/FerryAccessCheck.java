package org.example.tasks;

public class FerryAccessCheck {
    public boolean isFerryAllowedToSail(Transport[] transports) {
        int totalPassengers = 0;
        double totalWeight = 0;

        for (Transport transport : transports) {
            totalPassengers += transport.getPassengerCount();
            totalWeight += transport.getWeight();
        }

        return totalPassengers <= 50 && totalWeight < 15000;
    }
}

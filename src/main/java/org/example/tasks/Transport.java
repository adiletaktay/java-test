package org.example.tasks;

public class Transport {
    private String govNumber;
    private String type;
    private int passengerCount;
    private double weight;

    public Transport(String govNumber, String type, int passengerCount, double weight) {
        this.govNumber = govNumber;
        this.type = type;
        this.passengerCount = passengerCount;
        this.weight = weight;
    }

    public String getGovNumber() {
        return govNumber;
    }

    public void setGovNumber(String govNumber) {
        this.govNumber = govNumber;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getPassengerCount() {
        return passengerCount;
    }

    public void setPassengerCount(int passengerCount) {
        this.passengerCount = passengerCount;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}

package org.example;

public class Porsche implements Car, Cloneable {

    private String ownersName;

    public Porsche(String ownersName) {
        this.ownersName = ownersName;
    }

    public void sellTo(String ownersName) {
        this.ownersName = ownersName;
    }

    public String asString() {
        return "Porsche of " + ownersName;
    }

    public void drive() {
        System.out.println("Porsche driving");
    }

    @Override
    public Porsche clone() {
        try {
            return (Porsche) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}

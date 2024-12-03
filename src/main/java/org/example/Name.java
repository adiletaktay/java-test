package org.example;

public class Name implements Cloneable {

    private String firstName;
    private String lastName;

    public static Name newInstance(Name name) {
        return new Name(name.firstName, name.lastName);
    }

    public Name(Name name) {

    }

    public Name(String firstName, String lastName) {

    }

    public String firstName() {
        return firstName;
    }

    public String lastName() {
        return lastName;
    }

    public String name() {
        return firstName + " " + lastName;
    }

    public void alterTo(String firstName, String lastName) {

    }

    public Name clone() {
        try {
            return (Name) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}

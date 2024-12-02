package org.example;

public class Lion extends Animal implements Loggable {

    public void eat() {
        System.out.println("Lion is eating");
    }

    public String message() {
        return "something";
    }
}

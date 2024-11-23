package org.example;

public class Person {

    private Name personName;

    public Person(Name personName) {
        this.personName = personName;
    }

    public Person() {

    }

    public String helloWorld() {
        return "Hello World";
    }

    public String hello(String name) {
        return "Hello " + name;
    }
}

package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PersonTest {

    @Test
    public void shouldReturnHelloWorld() {

        Person adilet = new Person();
        assertEquals("Hello World", adilet.helloWorld() );
    }

    @Test
    public void shouldReturnHelloAdilet() {
        Person person = new Person();
        assertEquals("Hello Adilet", person.hello("Adilet"));
    }

    @Test
    public void shouldReturnNumberOfPersons() {
        Person person1 = new Person();
        Person person2 = new Person();
        assertEquals(2, Person.numberOfPersons());
    }
}

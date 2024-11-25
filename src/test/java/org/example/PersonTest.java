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

    @Test
    public void shouldReturnNumberOfPersonsInLoop() {
        Person person1;
        int i = 0;
        do {
            person1 = new Person();
            i++;
        } while (i < 4);
        assertEquals(4, Person.numberOfPersons());
    }

    @Test
    public void demonstrateBoolean() {
        int i = 4;
        int j = 3;
        boolean monday = false;
        boolean raining = true;

        if(shouldReturnDrinkBeer(i, j, monday, raining)) {
            drinkBeer();
        }

        if(i == j) {
            raining = true;
        }

        if(monday || raining) {
            i = 34;
            j = 91;
            i = i + j;
            drinkBeer();
        } else if (j > i) {
            i++;
            j = 56;
        } else if (i !=j) {
            i = 8;
        } else {
            j--;
        }
    }

    private void drinkBeer() {
    }

    private boolean shouldReturnDrinkBeer(int i, int j, boolean monday, boolean raining) {
        return i < j || ((monday && !raining) || j > 3);
    }
}

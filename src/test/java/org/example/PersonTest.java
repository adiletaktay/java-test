package org.example;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PersonTest {

    private static final String[] MY_STATE_VALUES = {"PENDING", "PROCESSING", "PROCESSED"};

    private static final int SOMETHING = 40;
    private static final int PROCESSING = 41;
    private static final int PROCESSED = 42;

    private static final String PENDING = "42";

    public String[] states() {
        return Arrays.copyOf(MY_STATE_VALUES, MY_STATE_VALUES.length);
    }

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

    @Test void demonstrateArrays() {
        Person persons [] = new Person[4];
        persons[0] = new Person();
        persons[1] = new Person();
        persons[2] = new Person();
        persons[3] = new Person();
        for (int i = 0; i < persons.length; i++) {
            persons[i] = new Person();
        }

        for (Person person: persons) {
            person.helloWorld();
        }

        Person myPerson = new Person();
        Person myPerson2 = null;

        final Person[] person2 = {persons[0], persons[3], myPerson, myPerson2, persons[2], persons[2]};

        LoggingLevel state = LoggingLevel.PROCESSING;

        String myString = "something";

        char myState = 'd';
        myState = 300;

        switch (myState) {
            default:
                someOtherMethod();
                break;
            case PENDING:
                // falls through
            case "something:
                callAMethod3();
                break;
            default:
        }

        for(LoggingLevel state: LoggingLevel.values()) {

            if (state == LoggingLevel.PENDING) {
                callAMethod();
            }
            if (state == LoggingLevel.PROCESSING) {
                callAMethod();
            }
            if (state == LoggingLevel.PROCESSED) {
                callAMethod();
            }
        }
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

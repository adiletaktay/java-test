package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CarTest {

    @Test
    public void primitiveShouldBeEqual() {
        int i = 4;
        int j = 4;
        assertTrue(i == j);
    }

    @Test
    public void stringShouldBeEqual() {
        String hello1 = "Hello";
        String hello2 = "H";
        hello2 = hello2 + "ello";
        System.out.println(hello2);
        assertTrue(hello1.equals(hello2));
    }

    @Test
    public void porscheShouldBeEqual() {
        Car myPorsche1 = new Car("Adilet", "Porsche", "silver");
        Car myPorsche2 = new Car("Adilet", "Porsche", "silver");
        assertTrue(myPorsche1.equals(myPorsche2));
    }
}

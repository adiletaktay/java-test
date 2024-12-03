package org.example;

import org.junit.jupiter.api.Test;

import java.math.BigInteger;

import static org.junit.jupiter.api.Assertions.*;

public class ImmutableTest {

    @Test
    public void demonstrateImmutableBigInteger() {
        BigInteger one = new BigInteger("1");
        BigInteger two = one.add(one);
        BigInteger zero = two.subtract(two);

        assertTrue(one.intValue() == 1);
        assertTrue(two.intValue() == 2);
        assertTrue(zero.intValue() == 0);

        System.out.println(zero);
        System.out.println(one);
        System.out.println(two);
    }

    @Test
    public void demonstrateImmutableString() {
        String s1 = "Hello";
        String s2 = "Hello";
        s1 = "Hi";

        assertNotEquals(s1, s2);
        assertEquals("Hi", s1);
        assertEquals("Hello", s2);

        System.out.println(s1);
        System.out.println(s2);
    }
}

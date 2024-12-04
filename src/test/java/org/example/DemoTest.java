package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DemoTest {

    private byte myByte;
    private short myShort;
    private int myInt;
    private long myLong;
    private float myFloat;
    private double myDouble;
    private Object myObject;

    private boolean myBoolean;
    private char myChar;

    @Test
    public void shouldDemonstrateStaticImport() {
        assertTrue(true);
    }

    @Test
    public void shouldDemonstrateDataTypeDefaultValues() {
        System.out.println("byte default value: " + myByte);
        System.out.println("short default value: " + myShort);
        System.out.println("int default value: " + myInt);
        System.out.println("long default value: " + myLong);
        System.out.println("float default value: " + myFloat);
        System.out.println("double default value: " + myDouble);
        System.out.println("Object default value: " + myObject);
        System.out.println("boolean default value: " + myBoolean);
        System.out.println("char default value: " + myChar);
        System.out.println("char default value as int: " +(int) myChar);
    }

    @Test
    public void shouldDemonstrateRanges() {
        System.out.println("byte: " + Byte.MIN_VALUE + " to " + Byte.MAX_VALUE);
        System.out.println("short: " + Short.MIN_VALUE + " to " + Short.MAX_VALUE);
        System.out.println("int: " + Integer.MIN_VALUE + " to " + Integer.MAX_VALUE);
        System.out.println("long: " + Long.MIN_VALUE + " to " + Long.MAX_VALUE);
        System.out.println("float: " + Float.MIN_VALUE + " to " + Float.MAX_VALUE);
        System.out.println("double: " + Double.MIN_VALUE + " to " + Double.MAX_VALUE);
        System.out.println("char: " + (int) Character.MIN_VALUE + " to " + (int) Character.MAX_VALUE);
    }

    @Test
    public void shouldDemonstrateBase2() {
        byte binary1 = 0B0;
        short binary2 = 0b1;
        int binary3 = 0b0100101_0101_0101_0101_1100_0000;
        System.out.println(binary1);
        System.out.println(binary2);
        System.out.println(binary3);
    }

    @Test
    public void shouldDemonstrateBase8() {
        byte octal1 = 07;
        short octal2 = 010;
        long octal3 = 017653100_______476L;
        System.out.println(octal1);
        System.out.println(octal2);
        System.out.println(octal3);
    }

    @Test
    public void shouldDemonstrateBase16() {
        byte hex1 = 0x0;
        short hex2 = 0xF;
        long hex3 = 0x39__e49Fa___BCD10L;
        System.out.println(hex1);
        System.out.println(hex2);
        System.out.println(hex3);
    }
}

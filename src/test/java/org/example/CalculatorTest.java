package org.example;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculatorTest {
    private Calculator calculator;

    @BeforeEach
    public void setUp() {
        calculator = new Calculator();
    }

    @Test
    public void whenAdd10To5ThenResult15() {
        double expected = 15;
        double result = calculator.add(10, 5);
        assertEquals(expected, result, 0.001);
    }

    @Test
    public void when5AddTo10AsStringThenResult15() {
        double expected = 15;
        double result = calculator.add("10", "5");
        assertEquals(expected, result, 0.001);
    }

    @Test
    public void whenInputIncorrectValueThenThrowException() {
        assertThrows(NumberFormatException.class, () -> {
            calculator.add("asdfgasdf", "5");
        });
    }

    @Test
    public void whenAdd100To50ThenResult150() {
        double expected2 = 150;
        double result2 = calculator.add(100, 50);
        assertEquals(expected2, result2, 0.001);
    }

    @Test
    public void whenDivide100By10ThenResult10() {
        double expected = 10;
        double result = calculator.divide(100, 10);
        assertEquals(expected, result, 0.001);
    }

    @Test
    public void whenDivide6By3AsStringThenResult2() {
        double expected = 2;
        double result = calculator.divide("6", "3");
        assertEquals(expected, result, 0.001);
    }

    @Test
    public void whenDivideIncorrectValueThenThrowException() {
        assertThrows(NumberFormatException.class, () -> {
            calculator.divide("asdfgasdf", "5");
        });
    }

    @Test
    public void whenDivide9By3ThenResult3() {
        double expected2 = 3;
        double result2 = calculator.divide(9, 3);
        assertEquals(expected2, result2, 0.001);
    }

    @Test
    public void when5MultipleBy10ThenResult50() {
        double expected = 50;
        double result = calculator.multiple(5, 10);
        assertEquals(expected, result, 0.001);
    }

    @Test
    public void when3MultipleBy3ThenResult9() {
        double expected2 = 9;
        double result2 = calculator.multiple(3, 3);
        assertEquals(expected2, result2, 0.001);
    }

    @Test
    public void squared10Equals100() {
        double expected = 100;
        double result = calculator.square(10);
        assertEquals(expected, result, 0.001);
    }

    @Test
    public void squared6Equals36() {
        double expected2 = 36;
        double result2 = calculator.square(6);
        assertEquals(expected2, result2, 0.001);
    }

    @AfterEach
    public void close() {
        calculator = null;
    }
}

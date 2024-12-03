package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PorscheTest {

    @Test
    public void shouldCloneStringArray() {
        String[] array = {"one", "two", "three"};
        String[] copiedArray = array.clone();
        assertSame(array, array);
        assertNotSame(array, copiedArray);

        for(String str: copiedArray) {
            System.out.println(str);
        }
    }

    @Test
    public void shouldClonePorsche() {
        Porsche porsche = new Porsche("Adilet");
        Porsche petersPorsche = porsche.clone();
        assertNotSame(porsche, petersPorsche);
        petersPorsche.sellTo("Peter");

        assertEquals("Porsche of Peter", petersPorsche.asString());
        assertEquals("Porsche of Adilet", porsche.asString());
    }
}

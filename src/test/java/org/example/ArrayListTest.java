package org.example;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.*;

public class ArrayListTest {

    private final int INITIAL_CAPACITY = 100;

    @Test
    public void shouldDemonstrateArrayList() {
        List<String> elements = new ArrayList<>(INITIAL_CAPACITY);
        elements.add("A");
        elements.add("B");
        elements.add("C");
        elements.add("A");
        elements.clear();
        System.out.println(elements.isEmpty());
        System.out.println(elements);
    }
}

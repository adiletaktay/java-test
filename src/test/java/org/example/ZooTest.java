package org.example;

import org.junit.jupiter.api.Test;

public class ZooTest {

    @Test
    public void shouldFeedAllAnimals() {
        Zoo zoo = new Zoo();
        Animal[] animals = { new Gorilla(), new Lion(), new Tiger()};
        zoo.feedAnimals(animals);
    }
}

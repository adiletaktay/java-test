package org.example;

import org.junit.jupiter.api.Test;

public class CarSelectorTest {

    @Test
    public void shouldCallMain() {
        String [] arguments = {"BMW", "Porsche"};
        CarSelector.main(arguments);
    }
}

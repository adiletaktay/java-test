package org.example;

import org.junit.jupiter.api.Test;

public class CarServiceTest {

    @Test
    public void shouldDemonstrateInterfaces() {
        CarService carService = new CarService();
        Car car;
        if (true) {
            car = new Porsche();
        } else {
            car = new BMW();
        }
        carService.drive(car);
    }
}

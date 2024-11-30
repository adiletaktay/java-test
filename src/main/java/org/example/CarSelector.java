package org.example;

import java.io.IOException;

public class CarSelector {

    public static void main(String[] arguments) {
        CarService carService = new CarService();
        for (String argument : arguments) {
            if (isValid(argument)) {
                carService.process(argument);
            } else {
                System.err.println("ignoring invalid argument:" + argument);
            }
        }
    }

    private static boolean isValid(String argument) {
        try {
            CarState carState = CarState.valueOf(argument);
            System.out.println("valid argument:" + argument);
        } catch (RuntimeException e){
            IOException e2 = new IOException("my IOException");
            throw new RuntimeException(e2);
        } finally {
            System.out.println("In finally block");
        }
        return true;
    }
}

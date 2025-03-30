package org.example.tasks;

/*
Есть коллекция автомобилей, нужно сгруппировать автомобили по производителю и вывести на экран.
Есть коллекция автомобилей. Нужно разделить на две части, в одной только электрокары, в другой остальные.
*/

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CarMain {
    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("G65", "AMG", false));
        cars.add(new Car("911 S Turbo", "Porsche", true));
        cars.add(new Car("R8", "Audi", false));
        cars.add(new Car("812f", "Ferrari", false));
        cars.add(new Car("Phantom", "Rolls-Royce", false));
        cars.add(new Car("Bentayga", "Bentley", true));
        cars.add(new Car("Discovery", "Range Rover", true));

        Map<String, List<Car>> groupedCars = cars.stream()
                .collect(Collectors.groupingBy(Car::getManufacturer));

        for (Map.Entry<String, List<Car>> entry : groupedCars.entrySet()) {
            System.out.println("Производитель: " + entry.getKey());
            System.out.println("Модели: " + entry.getValue());
            System.out.println();
        }

        Map<Boolean, List<Car>> partitionedCars = cars.stream()
                .collect(Collectors.partitioningBy(Car::isElectric));

        List<Car> electricCars = partitionedCars.get(true);
        List<Car> nonElectricCars = partitionedCars.get(false);

        System.out.println("Электрокары:");
        electricCars.forEach(System.out::println);

        System.out.println("\nОстальные автомобили:");
        nonElectricCars.forEach(System.out::println);
    }
}

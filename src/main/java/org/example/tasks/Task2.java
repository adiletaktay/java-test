package org.example.tasks;

/*
Есть коллекция чисел, найти первое, которое будет больше 22.
*/

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Task2 {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(15);
        numbers.add(22);
        numbers.add(25);
        numbers.add(30);
        numbers.add(5);

        Optional<Integer> firstGreaterThan22 = numbers.stream()
                .filter(n -> n > 22)
                .findFirst();

        if (firstGreaterThan22.isPresent()) {
            System.out.println("Первое число больше 22: " + firstGreaterThan22.get());
        } else {
            System.out.println("Чисел больше 22 не найдено.");
        }
    }
}

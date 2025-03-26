package org.example.tasks;

/*
Есть коллекция телефонов. У телефона есть название и производитель. Необходимо получить из этой коллекции коллекцию
производителей (производитель - это строка) и оставить только те, которые входят в список: Apple, Samsung, Xiaomi.
*/

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class PhoneMain {
    public static void main(String[] args) {
        List<Phone> phones = new ArrayList<>();
        phones.add(new Phone("iPhone 16", "Apple"));
        phones.add(new Phone("Galaxy S24", "Samsung"));
        phones.add(new Phone("Mi 15", "Xiaomi"));
        phones.add(new Phone("Pixel 9", "Google"));
        phones.add(new Phone("iPhone 16e", "Apple"));
        phones.add(new Phone("Reno 13", "Oppo"));

        Set<String> allowedManufacturers = Set.of("Apple", "Samsung", "Xiaomi");

        List<String> filteredManufacturers = phones.stream()
                .map(Phone::getManufacturer)
                .filter(allowedManufacturers::contains)
                .distinct()
                .collect(Collectors.toList());

        System.out.println(filteredManufacturers);
    }
}

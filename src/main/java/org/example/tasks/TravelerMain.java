package org.example.tasks;

/*
Есть класс путешественник. У путешественника есть имя и список посещенных им стран и городов, т.е. у путешественника
есть список объектов, внутри каждого такого объекта лежит название страны и список (лист) городов.
У вас есть список путешественников, из которого необходимо получить список всех уникальных городов в виде строки и
записать полученный результат в файл.
*/

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TravelerMain {
    public static void main(String[] args) {
        List<Traveler> travelers = List.of(
                new Traveler("Adi", List.of(
                        new Country("USA", List.of(new City("New York"), new City("Chicago"))),
                        new Country("Japan", List.of(new City("Tokyo"), new City("Osaka")))
                )),
                new Traveler("Di", List.of(
                        new Country("Italy", List.of(new City("Milan"), new City("Rome"))),
                        new Country("France", List.of(new City("Paris")))
                )),
                new Traveler("Bob", List.of(
                        new Country("Germany", List.of(new City("Berlin"), new City("Hamburg"))),
                        new Country("Monaco", List.of(new City("Monte-Carlo")))
                ))
        );

        Set<String> uniqueCities = new HashSet<>();
        for (Traveler traveler : travelers) {
            for (Country country : traveler.getVisitedCountries()) {
                for (City city : country.getCities()) {
                    uniqueCities.add(city.getName());
                }
            }
        }

        try (BufferedWriter writer = new BufferedWriter(new FileWriter("unique_cities.txt"))) {
            for (String city : uniqueCities) {
                writer.write(city);
                writer.newLine();
            }
            System.out.println("Уникальные города записаны в файл unique_cities.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

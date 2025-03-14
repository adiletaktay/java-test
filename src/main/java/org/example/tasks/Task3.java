package org.example.tasks;

/*
Есть две коллекции, нужно оставить в первой только те, которые есть во второй.
*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task3 {
    public static void main(String[] args) {
        List<String> collection1 = new ArrayList<>(Arrays.asList("Apple", "Banana", "Cherry", "Date", "Fig", "Grape"));

        List<String> collection2 = new ArrayList<>(Arrays.asList("Banana", "Fig", "Kiwi"));

        System.out.println("Первая коллекция до изменения: " + collection1);

        collection1.retainAll(collection2);

        System.out.println("Первая коллекция после изменения: " + collection1);
    }
}

package org.example.tasks;

/*
Одноклеточная амеба каждые 3 часа делится на 2 клетки.
Определить,сколько амеб будет через 3, 6, 9, 12,..., 24 часа.
 */

public class Task3 {
    public static void main(String[] args) {
        int initAmoebaCount = 1;
        int hours = 24;
        int divisionInterval = 3;

        for (int hour = divisionInterval; hour <= hours; hour += divisionInterval) {
            int amoebaCount = initAmoebaCount * (int) Math.pow(2, hour / divisionInterval);
            System.out.println("Через " + hour + " часов амеб будет: " + amoebaCount);
        }
    }
}

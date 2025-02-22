package org.example.tasks;

/*
Начав тренировки, спортсмен в первый день пробежал 10 км.
Каждый день он увеличивал дневную норму на 10% нормы предыдущего дня.
Какой суммарный путь пробежит спортсмен за 7 дней?
 */

public class Task2 {
    public static void main(String[] args) {
        double initDistance = 10;
        double incRate = 0.1;
        int days = 7;
        double totalDistance = 0;
        double distanceForDay = initDistance;

        for (int i = 0; i < days; i++) {
            totalDistance += distanceForDay;
            distanceForDay *= (1 + incRate);
        }

        System.out.println("Суммарный путь за 7 дней: " + totalDistance + " км");
    }
}

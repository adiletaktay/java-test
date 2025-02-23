package org.example.tasks;

/*
Напишите программу печати таблицы перевода расстояний из дюймов в сантиметрыдля значений длин от 1 до 20 дюймов.
1 дюйм = 2,54 см
 */

public class Task2 {
    public static void main(String[] args) {
        final double INCH_TO_CM = 2.54;

        System.out.println("Дюймы   Сантиметры");

        for (int i = 1; i <= 20; i++) {
            double centimeters = i * INCH_TO_CM;
            System.out.printf("%d\t%.2f\n", i, centimeters);
        }
    }
}

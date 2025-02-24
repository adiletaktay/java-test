package org.example.tasks;

/*
Есть массив чисел. Найти среднее арифметическое число элементов массива.
 */

public class Task3 {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50, 60, 70};

        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }

        double average = (double) sum / numbers.length;

        System.out.println("Среднее арифметическое: " + average);
    }
}

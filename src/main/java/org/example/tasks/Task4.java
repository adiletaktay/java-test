package org.example.tasks;

/*
Есть целочисленный неотсортированный массив. Отсортируйте его "пузырьком".
Попробуйте сами написать и затем посмотрите реализацию
*/

public class Task4 {
    public static void main(String[] args) {
        int[] numbers = {64, 34, 25, 12, 22, 11, 90};

        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = 0; j < numbers.length - 1 - i; j++) {
                if (numbers[j] > numbers[j + 1]) {
                    int temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                }
            }
        }

        System.out.println("Отсортированный массив:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
    }
}

package org.example.tasks;

/*
Есть массив чисел. Заменить каждый нечетный элемент массива на 0.
 */

public class Task4 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 != 0) {
                numbers[i] = 0;
            }
        }

        System.out.println("Массив после изменений:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
    }
}

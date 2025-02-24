package org.example.tasks;

/*
Создать массив из 3 элементов. При помощи класса Scanner и пользователя заполнить его.
Вывести сумму, наименьшее и наибольшее из чисел на экран.
 */

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = new int[3];

        System.out.println("Введите 3 числа:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Число " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        int sum = 0;
        int min = numbers[0];
        int max = numbers[0];

        for (int number : numbers) {
            sum += number;
            if (number < min) {
                min = number;
            }
            if (number > max) {
                max = number;
            }
        }

        System.out.println("Сумма: " + sum);
        System.out.println("Наименьшее число: " + min);
        System.out.println("Наибольшее число: " + max);

        scanner.close();
    }
}

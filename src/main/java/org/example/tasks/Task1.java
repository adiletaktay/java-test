package org.example.tasks;

/*
Даны числа от 0 до 100.
- Посчитать сумму четных и вывести на экран
- Посчитать сумму нечетных и вывести на экран
- Найти общую сумму всех чисел
 */

public class Task1 {
    public static void main(String[] args) {
        int evenSum = 0;
        int oddSum = 0;
        int totalSum = 0;

        for (int i = 0; i <= 100; i++) {
            totalSum += i;

            if (i % 2 == 0) {
                evenSum += i;
            } else {
                oddSum += i;
            }
        }

        System.out.println("Сумма четных чисел от 0 до 100: " + evenSum);
        System.out.println("Сумма нечетных чисел от 0 до 100: " + oddSum);
        System.out.println("Общая сумма всех чисел от 0 до 100: " + totalSum);
    }
}

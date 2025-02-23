package org.example.tasks;

/*
Напишите программу, определяющую сумму всех нечетных чисел от 1 до 99
 */

public class Task4 {
    public static void main(String[] args) {
        int sum = 0;

        for (int i = 1; i <= 99; i += 2) {
            sum += i;
        }

        System.out.println("Сумма всех нечётных чисел от 1 до 99: " + sum);
    }
}

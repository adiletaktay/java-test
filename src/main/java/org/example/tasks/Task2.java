package org.example.tasks;

/*
Написать программу, которая выводит на экран произведение двух чисел
 */

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Введите первое число: ");
            int num1 = scanner.nextInt();

            System.out.print("Введите второе число: ");
            int num2 = scanner.nextInt();

            if (num1 == 0 || num2 == 0) {
                System.out.println("Ошибка: на ноль умножить нельзя!");
            } else {
                int inc = num1 * num2;
                System.out.println("Произведение чисел: " + inc);
            }
        } catch (Exception e) {
            System.out.println("Ошибка ввода: " + e.getMessage());
        }
    }
}

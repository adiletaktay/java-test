package org.example.tasks;

import java.util.Scanner;

/*
Написать программу, которая выводит на экран остаток от деления двух чисел
 */

public class Task3 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Введите первое число: ");
            int num1 = scanner.nextInt();

            System.out.print("Введите второе число: ");
            int num2 = scanner.nextInt();

            if (num2 != 0) {
                int remainder = num1 % num2;
                System.out.println("Остаток от деления: " + remainder);
            } else {
                System.out.println("Ошибка: на ноль делить нельзя!");
            }
        } catch (Exception e) {
            System.out.println("Ошибка ввода: " + e.getMessage());
        }
    }
}

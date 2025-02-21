package org.example.tasks;

import java.util.Scanner;

/*
Написать программу, которая выводит на экран результат сложения двух строк
 */

public class Task4 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Введите первую строку: ");
            String str1 = scanner.nextLine();

            System.out.print("Введите вторую строку: ");
            String str2 = scanner.nextLine();

            String result = str1 + str2;

            System.out.println("Результат сложения строк: " + result);
        } catch (Exception e) {
            System.out.println("Ошибка ввода: " + e.getMessage());
        }
    }
}

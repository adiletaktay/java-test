package org.example.tasks;

/*
Составьте программу, вычисляющую A*B, не пользуясь операцией умножения.
 */

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {

            System.out.print("Введите число A: ");
            int A = scanner.nextInt();

            System.out.print("Введите число B: ");
            int B = scanner.nextInt();

            int result = 0;

            for (int i = 0; i < B; i++) {
                result += A;
            }

            System.out.println("Результат A * B = " + result);
        } catch (Exception e) {
            System.out.println("Произошла ошибка: " + e.getMessage());
        }
    }
}

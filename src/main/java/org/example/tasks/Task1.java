package org.example.tasks;

/*
Создайте массив чисел и заполните его любыми цифрами. Затем необходимо записать его в файл.
*/

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Random;

public class Task1 {
    public static void main(String[] args) {
        int arraySize = 10;

        int[] numbers = new int[arraySize];

        Random rand = new Random();
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = rand.nextInt(10);
        }

        String filePath = "numbers.txt";

        try (PrintWriter writer = new PrintWriter(new File(filePath))) {
            for (int num : numbers) {
                writer.print(num + " ");
            }
            System.out.println("Массив записан в файл: " + filePath);
        } catch (FileNotFoundException e) {
            System.out.println("Ошибка при записи в файл: " + e.getMessage());
        }
    }
}

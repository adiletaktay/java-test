package org.example.tasks;

/*
Дан некоторый текст, его нужно записать в файл. Можно использовать одно и то же предложение, запишите его 1000 раз.
*/

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Task2 {
    public static void main(String[] args) {
        String text = "Это предложение будет записано 1000 раз.\n";

        String filePath = "output.txt";

        try (PrintWriter writer = new PrintWriter(new File(filePath))) {
            for (int i = 0; i < 1000; i++) {
                writer.print(text);
            }
            System.out.println("Текст был записан 1000 раз в файл: " + filePath);
        } catch (FileNotFoundException e) {
            System.out.println("Ошибка при записи в файл: " + e.getMessage());
        }
    }
}

package org.example.tasks;

/*
Написать программу, которая бы обходила заданный каталог (включая вложенные папки и файлы) и печатала бы на экран
структуру. Это может быть папка с вашим проектом
*/

import java.io.File;

public class DirectoryStructure {
    public static void printDirectoryStructure(File dir, String indent) {
        if (dir.exists() && dir.isDirectory()) {
            File[] files = dir.listFiles();

            if (files != null) {
                for (File file : files) {
                    System.out.println(indent + (file.isDirectory() ? "[DIR] " : "[FILE] ") + file.getName());

                    if (file.isDirectory()) {
                        printDirectoryStructure(file, indent + "  ");
                    }
                }
            }
        } else {
            System.out.println("Указанный путь не существует или не является каталогом.");
        }
    }

    public static void main(String[] args) {
        String path = "C:/Users/Adi/Desktop/ADIAKTAY/java-test";
        File directory = new File(path);

        System.out.println("Структура каталога: ");
        printDirectoryStructure(directory, "");
    }
}

package org.example.tasks;

/*
Игра в слова. Есть строка “engineering”. Нужно выделить подстроку так, чтобы получилось два слова “engine” и “ring”.
*/

public class Task1 {
    public static void main(String[] args) {
        String word = "engineering";

        String firstWord = word.substring(0, 6);

        String secondWord = word.substring(7);

        System.out.println("Первое слово: " + firstWord);
        System.out.println("Второе слово: " + secondWord);
    }
}

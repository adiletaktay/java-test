package org.example.tasks;

/*
Есть массив строк, вывести на экран все строки, длина которых больше 5 символов
*/

public class Task3 {
    public static void main(String[] args) {
        String[] strings = {"apple", "banana", "kiwi", "strawberry", "grape", "blueberry"};

        for (String str : strings) {
            if (str.length() > 5) {
                System.out.println(str);
            }
        }
    }
}

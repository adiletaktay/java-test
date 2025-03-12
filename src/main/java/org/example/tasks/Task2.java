package org.example.tasks;

/*
Вход на вечеринку только по списку. Есть список имен (коллекция). Пользователь вводит с консоли свое имя, а программа
проверяет его наличие в списке, после чего говорит может он пройти или нет.
*/

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Task2 {
    public static void main(String[] args) {
        Set<String> guestList = new HashSet<>();
        guestList.add("Adi");
        guestList.add("Di");
        guestList.add("Madi");
        guestList.add("Shadi");
        guestList.add("Bob");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите ваше имя: ");
        String userName = scanner.nextLine();

        if (guestList.contains(userName)) {
            System.out.println("Добро пожаловать на вечеринку, " + userName + "!");
        } else {
            System.out.println("Извините, " + userName + ", вас нет в списке гостей.");
        }

        scanner.close();
    }
}

package org.example.tasks;

/*
Создайте целочисленный ArrayList. Заполните его 100 элементами, добавляя каждый новый элемент в начало списка и
выведите на экран. Затем удалите из него все четные элементы. И снова выведите на экран.
*/

import java.util.ArrayList;
import java.util.Iterator;

public class Task1 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();

        for (int i = 1; i <= 100; i++) {
            numbers.addFirst(i);
        }

        System.out.println("Содержимое ArrayList:");
        System.out.println(numbers);

        Iterator<Integer> iterator = numbers.iterator();
        while (iterator.hasNext()) {
            Integer number = iterator.next();
            if (number % 2 == 0) {
                iterator.remove();
            }
        }

        System.out.println("Содержимое ArrayList после удаления четных элементов:");
        System.out.println(numbers);
    }
}

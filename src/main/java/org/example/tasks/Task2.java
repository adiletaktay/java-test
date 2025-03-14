package org.example.tasks;

/*
Есть ArrayList и LinkedList на 100К одинаковых элементов. Нужно написать бенчмарк, который бы показал скорость удаления из
НАЧАЛА у двух этих листов. Удалить необходимо все элементы и показать результаты скорости выполнения у ArrayList и LinkedList.
*/

import java.util.*;

public class Task2 {
    public static void main(String[] args) {
        int size = 100_000;

        List<Integer> arrayList = new ArrayList<>(size);
        List<Integer> linkedList = new LinkedList<>();

        for (int i = 0; i < size; i++) {
            arrayList.add(i);
            linkedList.add(i);
        }

        long startTime = System.nanoTime();
        while (!arrayList.isEmpty()) {
            arrayList.removeFirst();
        }
        long endTime = System.nanoTime();
        long arrayListDuration = endTime - startTime;

        startTime = System.nanoTime();
        while (!linkedList.isEmpty()) {
            linkedList.removeFirst();
        }
        endTime = System.nanoTime();
        long linkedListDuration = endTime - startTime;

        System.out.println("Время удаления из начала для ArrayList: " + arrayListDuration + " нс");
        System.out.println("Время удаления из начала для LinkedList: " + linkedListDuration + " нс");
    }
}

package org.example.tasks;

/*
Есть ArrayList и LinkedList на 100К одинаковых элементов. Нужно написать бенчмарк, который бы показал скорость удаления из
СЕРЕДИНЫ у двух этих листов. Удалить необходимо все элементы и показать результаты скорости выполнения у ArrayList и LinkedList.
*/

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        int size = 100_000;

        List<Integer> arrayList = new ArrayList<>(size);
        List<Integer> linkedList = new LinkedList<>();

        for (int i = 0; i < size; i++) {
            arrayList.add(i);
            linkedList.add(i);
        }

        long startTime = System.nanoTime();
        for (int i = 0; i < size; i++) {
            arrayList.remove(arrayList.size() / 2);
        }
        long endTime = System.nanoTime();
        long arrayListDuration = endTime - startTime;

        startTime = System.nanoTime();
        for (int i = 0; i < size; i++) {
            linkedList.remove(linkedList.size() / 2);
        }
        endTime = System.nanoTime();
        long linkedListDuration = endTime - startTime;

        System.out.println("Время удаления из середины для ArrayList: " + arrayListDuration + " нс");
        System.out.println("Время удаления из середины для LinkedList: " + linkedListDuration + " нс");
    }
}

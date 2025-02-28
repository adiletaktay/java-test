package org.example.tasks;

import java.util.Arrays;

/*
Создать класс Warehouse, внутри которого массив целых чисел. Массив должен быть immutable. При создании обьекта
создается массив, заносятся в него данные, изменять или добавлять значения в массив после этого нельзя.
В класса должен быть метод next() который возвращает следующий элемент массива. Если дошли до последнего элемента при
вызове next(), должно вернуть первый экземпляр также должен быть метод getArray() - который возвращает массив и
переопределен метод toString().
*/

public class Warehouse {
    private final int[] array;
    private int currentIndex;

    public Warehouse(int[] array) {
        this.array = Arrays.copyOf(array, array.length);
    }

    public int next() {
        int element = array[currentIndex];
        currentIndex = (currentIndex + 1) % array.length;
        return element;
    }

    public int[] getArray() {
        return Arrays.copyOf(array, array.length);
    }

    @Override
    public String toString() {
        return "Warehouse" + Arrays.toString(array);
    }

    public static void main(String[] args) {
        Warehouse warehouse = new Warehouse(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10});

        System.out.println("Массив: " + warehouse);

        for (int i = 0; i < 10; i++) {
            System.out.println(warehouse.next());
        }

        System.out.println("Полученный массив: " + Arrays.toString(warehouse.getArray()));
    }
}

package org.example.tasks;

/*
При помощи двумерного массива вывести на экран таблицу умножения
 */

public class Task1 {
    public static void main(String[] args) {
        int size = 10;
        int[][] multiplicationTable = new int[size][size];

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                multiplicationTable[i][j] = (i + 1) * (j + 1);
            }
        }

        System.out.println("Таблица умножения:");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(multiplicationTable[i][j] + "\t");
            }
            System.out.println();
        }
    }
}

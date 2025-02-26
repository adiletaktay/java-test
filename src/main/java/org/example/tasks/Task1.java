package org.example.tasks;

/*
Самая длинная последовательность, состоящая из одинаковых элементов.
Найти в массиве самую длинную последовательность, состоящую из одинаковых элементов.
Вывести на экран количество элементов самой длиной последовательности и номер элемента, который является ее началом.
Например, если массив выглядит так:
0, 1, 1, 1, 0, 0, 1, 0, 1, 1, 1, 1, 1, 0, 0, 0, 1, 0, 1, 0,
то количество элементов самой длинной последовательности, состоящей из одинаковых элементов, равно 5, а начинается она с 9-го элемента (индекс 8).
 */

public class Task1 {
    public static void main(String[] args) {
        int[] numbers = {0, 1, 1, 1, 0, 0, 1, 0, 1, 1, 1, 1, 1, 0, 0, 0, 1, 0, 1, 0};

        int maxCount = 1;
        int currentCount = 1;
        int startIndex = 0;
        int tempIndex = 0;

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] == numbers[i - 1]) {
                currentCount++;
            } else {
                if (currentCount > maxCount) {
                    maxCount = currentCount;
                    startIndex = tempIndex;
                }
                currentCount = 1;
                tempIndex = i;
            }
        }

        if (currentCount > maxCount) {
            maxCount = currentCount;
            startIndex = tempIndex;
        }

        System.out.println("Длина самой длинной последовательности: " + maxCount);
        System.out.println("Индекс начала этой последовательности: " + startIndex);
    }
}

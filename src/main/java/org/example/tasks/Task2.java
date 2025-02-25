package org.example.tasks;

/*
Есть массив чисел, нужно инвертировать его порядок, т.е. массив [0,1,2,3,4] -> [4,3,2,1,0] или [6,9,8,7] -> [7,8,9,6]
 */

public class Task2 {
    public static void main(String[] args) {
        int[] numbers = {0, 1, 2, 3, 4};
//        int[] numbers = {6, 9, 8, 7};

        int n = numbers.length;
        for (int i = 0; i < n / 2; i++) {
            int temp = numbers[i];
            numbers[i] = numbers[n - 1 - i];
            numbers[n - 1 - i] = temp;
        }

        System.out.println("Массив после инверсии:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
    }
}

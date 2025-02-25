package org.example.tasks;

/*
Есть массив чисел. Необходимо создать другой массив содержащий только четные элементы из первого
 */

public class Task3 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int evenCount = 0;
        for (int num : numbers) {
            if (num % 2 == 0) {
                evenCount++;
            }
        }

        int[] evenNumbers = new int[evenCount];

        int index = 0;
        for (int num : numbers) {
            if (num % 2 == 0) {
                evenNumbers[index] = num;
                index++;
            }
        }

        System.out.println("Массив с четными числами:");
        for (int num : evenNumbers) {
            System.out.print(num + " ");
        }
    }
}

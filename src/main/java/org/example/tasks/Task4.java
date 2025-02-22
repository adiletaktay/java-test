package org.example.tasks;

/*
Вычислить: 1+2+4+8+...+256
 */

public class Task4 {
    public static void main(String[] args) {
        int sum = 0;
        int currentCount = 1;

        while (currentCount <= 256) {
            sum += currentCount;
            currentCount *= 2;
        }

        System.out.println("Сумма последовательности: " + sum);
    }
}

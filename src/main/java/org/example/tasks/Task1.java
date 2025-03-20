package org.example.tasks;

/*
Используя интерфейс BinaryOperator написать лямбда-выражение, которое бы умножало одно целое число на другое.
*/

import java.util.function.BinaryOperator;

public class Task1 {
    public static void main(String[] args) {
        BinaryOperator<Integer> multiply = (a, b) -> a * b;

        int result = multiply.apply(5, 10);

        System.out.println("Результат умножения: " + result);
    }
}

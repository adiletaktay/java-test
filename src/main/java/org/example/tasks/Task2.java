package org.example.tasks;

/*
Написать лябмда-функцию перевода числа в строку с добавлением денежной единицы. Например, 5 -> 5 рублей. Если получится,
то учесть правильность окончаний, если нет, то можно сократить до "руб".
Вызовите полученную функцию и выведите результат на экран.
*/

import java.util.function.Function;

public class Task2 {
    public static void main(String[] args) {
        Function<Integer, String> toCurrencyString = (amount) -> {
            int lastDigit = amount % 10;
            int lastTwoDigits = amount % 100;

            if (lastTwoDigits >= 11 && lastTwoDigits <= 14) {
                return amount + " рублей";
            } else if (lastDigit == 1) {
                return amount + " рубль";
            } else if (lastDigit >= 2 && lastDigit <= 4) {
                return amount + " рубля";
            } else {
                return amount + " рублей";
            }
        };

        System.out.println(toCurrencyString.apply(1));
        System.out.println(toCurrencyString.apply(2));
        System.out.println(toCurrencyString.apply(3));
        System.out.println(toCurrencyString.apply(10));
        System.out.println(toCurrencyString.apply(114));
        System.out.println(toCurrencyString.apply(224));
        System.out.println(toCurrencyString.apply(336));
    }
}

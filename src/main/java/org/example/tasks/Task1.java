package org.example.tasks;

/*
Обмен валют.
Создайте переменную типа int, которая будет в себе содержать сумму в долларах, которую мы хотим обменять.
Создайте переменную типа int с названием currencyId, которая будет хранить в себе ID валюты, в которую мы хотим перевести наши деньги.
Создайте оператор switch, который на основе ID валюты распечатает на экран конвертированную сумму.
Если неизвестный ID валюты, то вывести на экран сообщение о том, что ваш банк не может обменять на данную валюту
Курсы валют можете посмотреть в интернете или придумать сами.
 */

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Введите сумму в долларах: ");
            int dollars = scanner.nextInt();

            System.out.print("Введите ID валюты для обмена (1 - евро, 2 - иен, 3 - тенге): ");
            int currencyId = scanner.nextInt();

            double rateEUR = 0.95;
            double rateJPY = 152;
            double rateKZT = 500;

            double convertedAmount = 0;

            switch (currencyId) {
                case 1:
                    convertedAmount = dollars * rateEUR;
                    System.out.println("Сумма в евро: " + convertedAmount);
                    break;
                case 2:
                    convertedAmount = dollars * rateJPY;
                    System.out.println("Сумма в иен: " + convertedAmount);
                    break;
                case 3:
                    convertedAmount = dollars * rateKZT;
                    System.out.println("Сумма в тенге: " + convertedAmount);
                    break;
                default:
                    System.out.println("Ваш банк не может обменять на данную валюту.");
                    break;
            }
        } catch (Exception e) {
            System.out.println("Произошла ошибка: " + e.getMessage());
        }
    }
}

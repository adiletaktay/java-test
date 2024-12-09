package org.example;

public class WhatToEat {
    public static void main(String[] args) {
        int countOfMoney = 200;
        if (countOfMoney >= 500) {
            System.out.println("Пицца");
        } else if (countOfMoney >= 300) {
            System.out.println("Шаурма");
        } else if (countOfMoney >= 100) {
            System.out.println("Гамбургер");
        } else {
            System.out.println("Доширак");
        }
    }
}

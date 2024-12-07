package org.example;

public class Time {

    public static void main(String[] args) {
        int seconds = 1000000;
        int secondsInMinutes = 60;
        int secondsInHours = secondsInMinutes * 60;
        int secondsInDays = secondsInHours * 24;
        int days = seconds / secondsInDays;
        int hours = (seconds % secondsInDays) / secondsInHours;
        int minutes = ((seconds % secondsInDays) % secondsInHours) / secondsInMinutes;
        int leftSeconds = seconds - days * secondsInDays - hours * secondsInHours - minutes * secondsInMinutes;

        System.out.println("Дано количество секунд: " + seconds);
        System.out.println("Это равно");
        System.out.println("Дней: " + days);
        System.out.println("Часов: " + hours);
        System.out.println("Минут: " + minutes);
        System.out.println("Секунд: " + leftSeconds);
    }
}

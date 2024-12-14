package org.example;

public class Employee {
    String name;
    String position;
    int salary;

    Employee(String name, String position, int salary) {
        this.name = name;
        this.position = position;
        this.salary = salary;
    }

    String getInfo(int month) {
        return "Имя: " + name + ". Должность: " + position + ". За последние " + month + " месяцев получил " + month * salary + " рублей.";
    }
}

package org.example.tasks;

public class Student {
    private String firstName;
    private String lastName;
    private int age;

    private Student(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public static Student createStudent(String firstName, String lastName, int age) {
        return new Student(firstName, lastName, age);
    }

    public String getStudentInfo() {
        return "Имя: " + firstName + ", Фамилия: " + lastName + ", Возраст: " + age;
    }
}

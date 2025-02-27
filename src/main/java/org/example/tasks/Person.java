package org.example.tasks;

/*
Создать класс Person с полями Имя, фамилия, год рождения, пол(мужской и женский), семейный статус(single/married).
Создайте класс? который будет обрабатывать данные клиентов.
В этом классе должен быть метод, который в качестве аргумента принимает обьект типа Person и делает следующее: если
человек старше 18 и single предложите ему услуги своего сайта знакомств(распечатайте сообщение в консоль):
"Уважаемый Савелий, желаете ли познакомиться с девушкой?" или "Уважаемая Виолетта, мы поможем вам найти мужчину мечты!"
Создайте еще один класс с методом main в котором создайте массив обьектов Person и обработайте каждый из элементов
массива с помощью метода из предыдущего класса.
*/

public class Person {
    private String firstName;
    private String lastName;
    private int birthYear;
    private String gender;
    private String maritalStatus;

    public Person(String firstName, String lastName, int birthYear, String gender, String maritalStatus) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthYear = birthYear;
        this.gender = gender;
        this.maritalStatus = maritalStatus;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getMaritalStatus() {
        return maritalStatus;
    }

    public void setMaritalStatus(String maritalStatus) {
        this.maritalStatus = maritalStatus;
    }
}

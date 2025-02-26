package org.example.tasks;

/*
Создайте класс, у которого будут поля имя и возраст. У класса должен быть конструктор, который принимает в виде аргументов
эти два поля и конструктор без аргументов, который присваивает значения по умолчанию для имени и возраста.
Добавьте в класс блок инициализации, который будет выводить на экран сообщение о том, что создали новый экземпляр класса.
Создайте массив, состоящий из обьектов класса из Task2. Выведите полученный массив на экран, должны отображатся
названия полей класса и их значения.
*/

public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        init();
    }

    public Person() {
        this("Unnamed", 18);
    }

    private void init() {
        System.out.println("Создан новый экземпляр класса: " + this.name + ", " + this.age + " лет");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Имя: " + this.name + ", Возраст: " + this.age;
    }

    public static void main(String[] args) {
        Person[] people = new Person[5];
        people[0] = new Person("Adi", 27);
        people[1] = new Person();
        people[2] = new Person("Di", 24);
        people[3] = new Person("Madi", 26);
        people[4] = new Person("Shadi", 25);

        for (Person person : people) {
            System.out.println(person);
        }
    }
}

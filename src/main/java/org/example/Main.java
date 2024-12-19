package org.example;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        ArrayList<String> names = new ArrayList<>();
        ArrayList<String> namesAndNumbers = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            numbers.add(i);
        }
        names.add("Андрей");
        names.add("Катя");
        names.add("Настя");
        names.add("Антон");
        names.add("Женя");
        names.add("Дима");
        names.add("Коля");
        names.add("Мария");
        names.add("Роман");
        names.add("Павел");
        for (int i = 0; i < numbers.size(); i++) {
            String s = numbers.get(i) + " - " + names.get(i);
            namesAndNumbers.add(s);
        }
        for (String s : namesAndNumbers) {
            System.out.println(s);
        }

        String sourceData = "Это Иван. Ему 34 года. Его рост 166.3 см. Должность \"Программист\"";
        String name = sourceData.substring(4, 8);
        String ageString = sourceData.substring(14, 16);
        int age = Integer.parseInt(ageString);
        String heightString = sourceData.substring(32, 37);
        double height = Double.parseDouble(heightString);
        String position = sourceData.substring(53, 64);
        Man man = new Man(name, position, age, height);
        System.out.println(man.getName() + " " + man.getPosition() + " " + man.getAge() + " года " + man.getHeight() + "см.");

        Dog dog = new Dog();
        dog.name = "Rex";
        dog.breed = "Pit bull";
        dog.speed = 5;
        dog.run();
        System.out.println(dog.info());

        Rect rect = new Rect();
        rect.setDimens(20, 30);
        System.out.println(rect.perimeter());
        System.out.println(rect.area());

        Employee employee = new Employee("Иван", "Программист", 50000);
        System.out.println(employee.getInfo(12));

        Monster monster1 = new Monster();
        Monster monster2 = new Monster(1, 1, 1);
        Monster monster3 = new Monster(4, 2);
        monster1.voice();
        monster2.voice(3);
        monster3.voice(5, "Я монстр 3");

        Box box1 = new Box(10);
        Box box2 = new Box(20, 20, 10);
        Box box3 = box1.sumBox(box2);
        box1.showVolume();
        box2.showVolume();
        box3.showVolume();
        double volumeSum = box1.volume() + box3.volume();
        System.out.println("box1 + box3 = " + volumeSum);
    }
}

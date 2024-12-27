package org.example;

import java.util.ArrayList;

public class Main {

    static boolean win = false;

    public static void main(String[] args) {
        int random1 = (int) (Math.random() * 1000000000);
        System.out.println(random1);
        Thread timer = new Thread(new Runnable() {
            @Override
            public void run() {
                int i = 0;
                try {
                    while (!win) {
                        System.out.println(i);
                        i++;
                        Thread.sleep(1000);
                    }
                } catch (InterruptedException e) {

                }
            }
        });
        Thread player = new Thread(new Runnable() {
            @Override
            public void run() {
                while (!win) {
                    int guessNumber = (int) (Math.random() * 1000000000);
                    if (guessNumber == random1) {
                        win = true;
                        System.out.println(guessNumber);
                    }
                }
            }
        });
        timer.start();
        player.start();

        try {
            int[] array = new int[10];
            System.out.println(array[25]);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Выход за пределы массива");
        }

        int random = (int) (Math.random() * 90 + 10);
        String result = String.format("Случайное число %s. Попробуйте еще раз...", random);
        System.out.println(result);

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

        Rect rect = new Rect(5, 10);
        Triangle triangle = new Triangle(10);
        System.out.println(rect.area());
        System.out.println(triangle.area());

        Programmer programmer1 = new Programmer("Adi");
        Programmer programmer2 = new Programmer("Madi");
        Programmer programmer3 = new Programmer("Shadi");
        Driver driver1 = new Driver("Sadi");
        Driver driver2 = new Driver("Body");
        Driver driver3 = new Driver("Tidy");
        Cooker cooker1 = new Cooker("Diddy");
        Cooker cooker2 = new Cooker("Lady");
        Cooker cooker3 = new Cooker("Willy");

        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(programmer1);
        employees.add(programmer2);
        employees.add(programmer3);
        employees.add(driver1);
        employees.add(driver2);
        employees.add(driver3);
        employees.add(cooker1);
        employees.add(cooker2);
        employees.add(cooker3);
        for (Employee employee : employees) {
            employee.voice();
        }

        ArrayList<CodeWritable> programmers = new ArrayList<>();
        programmers.add(programmer1);
        programmers.add(programmer2);
        programmers.add(programmer3);
        for (CodeWritable programmer : programmers) {
            programmer.writeCode();
        }

        ArrayList<Drivable> drivers = new ArrayList<>();
        drivers.add(driver1);
        drivers.add(driver2);
        drivers.add(driver3);
        for (Drivable driver : drivers) {
            driver.drive();
        }

        ArrayList<Cookable> cookers = new ArrayList<>();
        cookers.add(cooker1);
        cookers.add(cooker2);
        cookers.add(cooker3);
        for (Cookable cookable : cookers) {
            cookable.cook();
        }

        Director director = new Director();
        director.force(new Counter() {
            @Override
            public String report(int countOfMonths) {
                return "Отчет за " + countOfMonths + " месяцев";
            }
        }, 12);

        MyCounter counter = new MyCounter();
        director.force(counter, 12);

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

        Box box = new Box(15);
        BoxWeight boxWeight = new BoxWeight(10, 20, 30, 40);
        box.showInfo();
        boxWeight.showInfo();

        Car car1 = new Car("Porsche", 1);
        Car car2 = new Car("Porsche", 1);
        System.out.println(car1.hashCode());
        System.out.println(car2.hashCode());
    }
}

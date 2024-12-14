package org.example;

public class Main {
    public static void main(String[] args) {
        Man man1 = new Man();
        Man man2 = new Man();
        Man man3 = new Man();
        Man man4 = new Man();
        Man man5 = new Man();

        man1.name = "Adi";
        man1.age = 27;
        man1.weight = 65;
        man2.name = "Di";
        man2.age = 24;
        man2.weight = 55;
        man3.name = "Madi";
        man3.age = 22;
        man3.weight = 80;
        man4.name = "Shadi";
        man4.age = 20;
        man4.weight = 95;
        man5.name = "Kadi";
        man5.age = 18;
        man5.weight = 70;

        Man[] men = new Man[5];
        men[0] = man1;
        men[1] = man2;
        men[2] = man3;
        men[3] = man4;
        men[4] = man5;

        int sum = 0;
        for (int i = 0; i < men.length; i++) {
            sum += men[i].age;
        }
        System.out.println(sum / (double) men.length);

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
    }
}

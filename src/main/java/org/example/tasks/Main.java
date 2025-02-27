package org.example.tasks;

public class Main {
    public static void main(String[] args) {
        Person[] clients = new Person[]{
                new Person("Савелий", "Петров", 2000, "male", "single"),
                new Person("Виолетта", "Смирнова", 1995, "female", "single"),
                new Person("Алексей", "Иванов", 2003, "male", "married"),
                new Person("Марина", "Кузнецова", 1992, "female", "single"),
                new Person("Петр", "Дмитриев", 2005, "male", "single")
        };

        ClientService service = new ClientService();

        for (Person client : clients) {
            service.offerDatingService(client);
        }
    }
}

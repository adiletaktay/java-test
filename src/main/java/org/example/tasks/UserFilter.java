package org.example.tasks;

/*
Создать метод, который бы принимал на вход List<User> и предикат, по которому все юзеры, у которых имена начинаются
с A,P,E удалялись бы из этого листа.
*/

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class UserFilter {
    public static void removeUsers(List<User> users, Predicate<User> predicate) {
        users.removeIf(predicate);
    }

    public static void main(String[] args) {
        List<User> users = new ArrayList<>();
        users.add(new User("Adi"));
        users.add(new User("Di"));
        users.add(new User("Madi"));
        users.add(new User("Eve"));
        users.add(new User("Paul"));

        Predicate<User> startsWithAorPorE = user -> {
            String name = user.getName().toUpperCase();
            return name.startsWith("A") || name.startsWith("P") || name.startsWith("E");
        };

        System.out.println("До удаления:");
        users.forEach(System.out::println);

        removeUsers(users, startsWithAorPorE);

        System.out.println("\nПосле удаления:");
        users.forEach(System.out::println);
    }
}

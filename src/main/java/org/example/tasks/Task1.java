package org.example.tasks;

/*
Есть коллекция строк, нужно убрать все элементы, длина которых меньше 5 символов.
*/

import java.util.ArrayList;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        strings.add("Java");
        strings.add("Programming");
        strings.add("Code");
        strings.add("Hello");
        strings.add("World");
        strings.add("Example");

        strings.removeIf(s -> s.length() < 5);

        System.out.println(strings);
    }
}

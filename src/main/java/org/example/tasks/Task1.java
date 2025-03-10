package org.example.tasks;

/*
Есть массив слов. Нужно отфильтровать его так, чтобы в выходном массиве оказались слова, которые начинаются с буквы “W”/”w”.
*/

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Task1 {
    public static void main(String[] args) {
        String[] words = {"While", "major", "Water", "add", "Wool", "good", "world", "Plan", "wonderful", "waste"};

        List<String> filteredWords = Arrays.stream(words)
                .filter(word -> word.startsWith("W") || word.startsWith("w"))
                .collect(Collectors.toList());

        System.out.println(filteredWords);
    }
}

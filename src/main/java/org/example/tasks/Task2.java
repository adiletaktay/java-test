package org.example.tasks;

/*
Создайте метод, который определит, является ли слово палиндромом. Метод должен принимать строку, а возвращать boolean.
*/

public class Task2 {
    public static boolean isPalindrome(String word) {
        String sanitizedWord = word.toLowerCase().replaceAll("[^a-z]", "");
        String reversedWord = new StringBuilder(sanitizedWord).reverse().toString();
        return sanitizedWord.equals(reversedWord);
    }

    public static void main(String[] args) {
        String[] words = {"radar", "hello", "madam", "racecar"};

        for (String word : words) {
            System.out.println(word + " is palindrome: " + isPalindrome(word));
        }
    }
}

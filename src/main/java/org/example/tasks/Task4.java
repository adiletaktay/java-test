package org.example.tasks;

/*
Дан текст:
“While major gameplay components are already in place and functioning, players help is needed to add some of the
smaller features and content. Of course polishing the overall experience is important at the same time. Game has been
extensively tested in closed group, but it is always important to hear fresh suggestions from larger crowd that come
from various gaming backgrounds. Plan is to make the game as good as possible but without compromising the core idea.”
Нужно узнать содержит ли текст слова “alert”, “add”, “good”, “plan” и какое кол-во.
*/

public class Task4 {
    public static void main(String[] args) {
        String text = "While major gameplay components are already in place and functioning," +
                "players help is needed to add some of the smaller features and content." +
                "Of course polishing the overall experience is important at the same time." +
                "Game has been extensively tested in closed group, but it is always important to hear fresh " +
                "suggestions from larger crowd that come from various gaming backgrounds. " +
                "Plan is to make the game as good as possible but without compromising the core idea.";

        String[] words = text.toLowerCase().split("\\W+");

        String[] checkWords = {"alert", "add", "good", "plan"};

        for (String checkWord : checkWords) {
            int count = 0;
            for (String word : words) {
                if (word.equals(checkWord)) {
                    count++;
                }
            }
            System.out.println("Слово '" + checkWord + "' встречается " + count + " раз(а).");
        }
    }
}

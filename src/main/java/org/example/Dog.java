package org.example;

public class Dog {
    String name;
    String breed;
    int speed;

    void run() {
        String result = "";
        for (int i = 0; i < speed; i++) {
            result += "run";

            if (i == speed - 1) {
                result += ".";
            } else {
                result += ", ";
            }
        }
        System.out.println(result);
    }

    String info() {
        return "Name: " + name + " Bread: " + breed + " Speed " + speed;
    }
}

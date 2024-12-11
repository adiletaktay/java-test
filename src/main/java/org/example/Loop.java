package org.example;

public class Loop {
    public static void main(String[] args) {
        int sum = 0;
        int count = 1;
        while (count <= 100) {
            sum += count;
            count++;
        }
        float result = sum / (float) count;
        System.out.println(result);

        int a = 0;
        do {
            System.out.println("Привет");
        } while (a > 0);

        for (int i = 0; i < 100; i++) {
            System.out.println(i);
        }
    }
}

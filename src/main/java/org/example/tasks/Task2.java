package org.example.tasks;

/*
Есть склад авто и выяснилось, что всем присвоили неверные маркировки двигателя. Необходимо все 1.4 литра двигатели
заменить на 2.0Т, а все 1.8, на 1.8Т.
*/

import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {
        String[] engines = {"1.4", "1.8", "2.0", "1.4", "1.8", "3.5"};

        for (int i = 0; i < engines.length; i++) {
            if (engines[i].equals("1.4")) {
                engines[i] = "2.0T";
            } else if (engines[i].equals("1.8")) {
                engines[i] = "1.8T";
            }
        }

        System.out.println(Arrays.toString(engines));
    }
}

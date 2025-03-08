package org.example.tasks;

/*
Есть строка “Green. red. blue. yellow”. Необходимо заменить все точки на запятые
*/

public class Task3 {
    public static void main(String[] args) {
        String str = "Green. red. blue. yellow";

        String modifiedStr = str.replace(".", ",");

        System.out.println(modifiedStr);
    }
}

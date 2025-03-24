package org.example.tasks;

/*
Есть HashSet магазинов. У магазина есть название и ID. Создать несколько магазинов с одинаковым ID, названием и добавить
их в ваш Set. Попробуйте разобраться почему они все добавились, несмотря на то, что Set гарантирует уникальность.
*/

import java.util.HashSet;

public class StoreMain {
    public static void main(String[] args) {
        HashSet<Store> stores = new HashSet<>();

        Store store1 = new Store("Store A", 1);
        Store store2 = new Store("Store A", 1);
        Store store3 = new Store("Store A", 1);

        stores.add(store1);
        stores.add(store2);
        stores.add(store3);

        System.out.println("Магазины в HashSet:");
        for (Store store : stores) {
            System.out.println(store);
        }
    }
}

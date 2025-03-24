package org.example.tasks;

import java.util.Objects;

public class Store {
    private String name;
    private int id;

    public Store(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Store{name='" + name + "', id=" + id + "}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Store)) return false;
        Store store = (Store) o;
        return id == store.id && Objects.equals(name, store.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, id);
    }
}

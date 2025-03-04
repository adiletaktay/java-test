package org.example.tasks;

import java.util.ArrayList;
import java.util.List;

public class Branch {
    private List<Fruit> fruits = new ArrayList<>();
    private List<Branch> branches = new ArrayList<>();

    public void addFruit(Fruit fruit) {
        fruits.add(fruit);
    }

    public void addBranch(Branch branch) {
        branches.add(branch);
    }

    public List<Fruit> getFruits() {
        return fruits;
    }

    public List<Branch> getBranches() {
        return branches;
    }
}

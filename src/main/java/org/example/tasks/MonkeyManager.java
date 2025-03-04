package org.example.tasks;

class MonkeyManager {
    private Monkey monkey;

    public MonkeyManager(Monkey monkey) {
        this.monkey = monkey;
    }

    public int askMonkeyToCountFruits(Branch branch) {
        return monkey.countFruits(branch);
    }
}

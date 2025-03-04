package org.example.tasks;

class SmartMonkey extends Monkey {
    @Override
    public int countFruits(Branch branch) {
        int count = 0;
        count += branch.getFruits().size();

        for (Branch subBranch : branch.getBranches()) {
            count += countFruits(subBranch);
        }
        return count;
    }
}

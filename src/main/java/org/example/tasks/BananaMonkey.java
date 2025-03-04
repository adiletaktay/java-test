package org.example.tasks;

class BananaMonkey extends Monkey {
    @Override
    public int countFruits(Branch branch) {
        int count = 0;
        for (Fruit fruit : branch.getFruits()) {
            if (fruit instanceof Banana) {
                count++;
            }
        }

        for (Branch subBranch : branch.getBranches()) {
            count += countFruits(subBranch);
        }
        return count;
    }
}

package org.example.tasks;

/*
Есть 2 дерева, на одном растут бананы, на другом - кокосы. Дерево состоит из веток (само дерево - главная ветка).
На ветке могут быть фрукты (т.е. бананы или кокосы) и другие ветки. Для каждой ветки при ее создании можно задать кол-во фруктов.
Есть 3 обезьяны, одна умеет считать кокосы, вторая бананы, а третья - и кокосы и бананы (типо умная). Есть класс -
MonkeyManager, в котором есть метод - попросить любую обезьяну посчитать фрукты на дереве.
Решите эту задачу при помощи рекурсии.
*/

public class Main {
    public static void main(String[] args) {
        Banana banana1 = new Banana();
        Banana banana2 = new Banana();
        Coconut coconut1 = new Coconut();
        Coconut coconut2 = new Coconut();

        Branch branch1 = new Branch();
        branch1.addFruit(banana1);
        branch1.addFruit(banana2);

        Branch branch2 = new Branch();
        branch2.addFruit(coconut1);

        Branch branch3 = new Branch();
        branch3.addFruit(coconut2);

        branch1.addBranch(branch2);
        branch1.addBranch(branch3);

        MonkeyManager manager = new MonkeyManager(new SmartMonkey());
        int totalFruits = manager.askMonkeyToCountFruits(branch1);
        System.out.println("Умная обезьяна посчитала: " + totalFruits + " фруктов.");

        manager = new MonkeyManager(new CoconutMonkey());
        int coconutCount = manager.askMonkeyToCountFruits(branch1);
        System.out.println("Обезьяна, считающая кокосы, посчитала: " + coconutCount + " кокосов.");

        manager = new MonkeyManager(new BananaMonkey());
        int bananaCount = manager.askMonkeyToCountFruits(branch1);
        System.out.println("Обезьяна, считающая бананы, посчитала: " + bananaCount + " бананов.");
    }
}

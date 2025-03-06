package org.example.tasks;

/*
Вы пришли домой, но поняли что оставили ключи на работе. К счастью у вас электронный замок и с собой ноутбук.
Вам необходимо создать класс Flat и несколько приватных методов openDoor().
Один с аргументом String passcode, другой без аргументов.
В классе с методом мейн создайте экземпляр Flat и вызовите openDoor() без аргументов.
*/

public class Flat {
    private void openMainDoor() {
        System.out.println("Главная дверь открыта.");
    }

    private void openBedroomDoor() {
        System.out.println("Дверь в спальню открыта.");
    }

    private void openBathroomDoor() {
        System.out.println("Дверь в ванную комнату открыта.");
    }

    public void openDoor() {
        System.out.println("Открываю двери без пароля...");
        openMainDoor();
        openBedroomDoor();
        openBathroomDoor();
    }

    public void openDoor(String passcode) {
        if (passcode.equals("1234")) {
            System.out.println("Пароль верен. Открываю двери...");
            openMainDoor();
            openBedroomDoor();
            openBathroomDoor();
        } else {
            System.out.println("Неверный пароль. Двери не открыты.");
        }
    }

    public static void main(String[] args) {
        Flat myFlat = new Flat();

        myFlat.openDoor();
    }
}

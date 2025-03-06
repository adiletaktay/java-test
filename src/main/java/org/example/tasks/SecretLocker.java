package org.example.tasks;

import java.lang.reflect.Field;

/*
Создайте класс SecretLocker. Добавьте в класс поле: private final String passcode;
Добавьте метод, который будет возвращать значение passcode. Создайте экземпляр класса SecretLocker.
При помощи рефлексии поменяйте passcode у созданного объекта.
Выведите на экран объект класса SecretLocker до и после замены passcode.
*/

public class SecretLocker {
    private final String passcode;

    public SecretLocker(String passcode) {
        this.passcode = passcode;
    }

    public String getPasscode() {
        return passcode;
    }

    @Override
    public String toString() {
        return "SecretLocker{passcode='" + passcode + "'}";
    }

    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        SecretLocker locker = new SecretLocker("1234");
        System.out.println("До изменения: " + locker);

        Field passcodeField = SecretLocker.class.getDeclaredField("passcode");
        passcodeField.setAccessible(true);

        passcodeField.set(locker, "5678");

        System.out.println("После изменения: " + locker);
    }
}

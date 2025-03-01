package org.example.tasks;

/*
Есть класс автомобиль. У автомобиля есть коробка передач и мотор. У мотора должны быть методы "заглушить мотор" и "завести
мотор". Если попробовать завести работающий мотор, то вывести на экран, что мотор уже работает. Если заглушить не
работающий мотор, то вывести на экран, что мотор уже заглушен.
У коробки передач должны быть методы "переключить передачу выше" и "переключить передачу ниже". Нельзя понизить передачу
ниже 0 и повысить больше 7.
Машина должна уметь ездить, т.е. надо завести мотор, включить первую передачу и нажать газ. Машина не может поехать,
если не заведен мотор. Когда машина едет, то пускай выведет на экран текущую скорость:
Скорость = текущая_передача * 20
P.S имена методов условные, ваши могут отличаться в названии. Помните, что поля класса должны быть приватными.
*/

public class Car {
    private Engine engine;
    private Gearbox gearbox;
    private int speed;
    private boolean isMoving;

    public Car() {
        engine = new Engine();
        gearbox = new Gearbox();
        speed = 0;
        isMoving = false;
    }

    public void startEngine() {
        engine.startEngine();
    }

    public void stopEngine() {
        engine.stopEngine();
    }

    public void shiftUp() {
        gearbox.shiftUp();
    }

    public void shiftDown() {
        gearbox.shiftDown();
    }

    public void pressGas() {
        if (!engine.isEngineRunning()) {
            System.out.println("Машина не может поехать, так как мотор не заведен.");
        } else if (gearbox.getCurrentGear() == 0) {
            System.out.println("Машина не может поехать, так как не включена первая передача.");
        } else {
            isMoving = true;
            System.out.println("Машина поехала!");
            updateSpeed();
        }
    }

    private void updateSpeed() {
        if (isMoving) {
            speed = gearbox.getCurrentGear() * 20;
            System.out.println("Текущая скорость: " + speed + " км/ч");
        }
    }

    public void stopCar() {
        if (isMoving) {
            isMoving = false;
            speed = 0;
            System.out.println("Машина остановлена.");
        } else {
            System.out.println("Машина уже стоит.");
        }
    }
}

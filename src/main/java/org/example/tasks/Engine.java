package org.example.tasks;

public class Engine {
    private boolean isRunning;

    public void startEngine() {
        if (isRunning) {
            System.out.println("Мотор уже работает.");
        } else {
            isRunning = true;
            System.out.println("Мотор заведен.");
        }
    }

    public void stopEngine() {
        if (!isRunning) {
            System.out.println("Мотор уже заглушен.");
        } else {
            isRunning = false;
            System.out.println("Мотор заглушен.");
        }
    }

    public boolean isEngineRunning() {
        return isRunning;
    }
}

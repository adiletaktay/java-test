package org.example.tasks;

public class Gearbox {
    private int currentGear;

    public Gearbox() {
        currentGear = 0;
    }

    public void shiftUp() {
        if (currentGear < 7) {
            currentGear++;
            System.out.println("Переключено на передачу: " + currentGear);
        } else {
            System.out.println("Невозможно переключиться на более высокую передачу. Максимум 7.");
        }
    }

    public void shiftDown() {
        if (currentGear > 0) {
            currentGear--;
            System.out.println("Переключено на передачу: " + currentGear);
        } else {
            System.out.println("Невозможно переключиться на более низкую передачу. Минимум 0.");
        }
    }

    public int getCurrentGear() {
        return currentGear;
    }
}

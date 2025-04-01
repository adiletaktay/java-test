package org.example.tasks;

/*
Создайте класс Motorcycle, в котором должны быть поля:
- brand
- model
- engine - это отдельный класс Engine у которого есть поле volume (объем двигателя в см3) и серийный номер в виде строки.
В классе Motorcycle должен быть 1 конструктор для инициализации всех полей.
В классе с методом main() создайте объект типа Motorcycle и сериализуйте его в файл. Далее в этом же классе
десериализуйте Motorcycle из файла и выведите его в консоль.
А теперь поменяйте любое приватное поле в классе Motorcycle на public и попробуйте восстановить файл из Task 1 в объект.
*/

import java.io.*;

public class Main {
    public static void main(String[] args) {
        Engine engine = new Engine(3.5, "qwerty12345");
        Motorcycle motorcycle = new Motorcycle("Kawasaki", "red", engine);

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("motorcycle.ser"))) {
            oos.writeObject(motorcycle);
            System.out.println("Объект сериализован в файл motorcycle.ser");
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("motorcycle.ser"))) {
            Motorcycle deserializedMotorcycle = (Motorcycle) ois.readObject();
            System.out.println("Объект десериализован:");
            System.out.println(deserializedMotorcycle);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}

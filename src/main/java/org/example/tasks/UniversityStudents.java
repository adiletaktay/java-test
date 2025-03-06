package org.example.tasks;

/*
Вы студент, который не прошел вступительный экзамен в университет. Но вам очень хочется начать обучение, поэтому
вы решаете самостоятельно добавить себя в базу студентов университета.
Создайте класс UniversityStudents, внутри которого находится массив freshmen (первокурсники).
Создайте класс Student и сделайте у него приватный конструктор с 3 аргументами - имя, фамилия, возраст.
В классе с методом main() создайте экземпляр класса Student и добавьте в массив студентов вашего университета.
Распечатайте массив со студентами до и после добавления студента.
*/

public class UniversityStudents {
    private Student[] freshmen;
    private int currentSize;

    public UniversityStudents(int capacity) {
        freshmen = new Student[capacity];
        currentSize = 0;
    }

    public void addStudent(Student student) {
        if (currentSize < freshmen.length) {
            freshmen[currentSize] = student;
            currentSize++;
        } else {
            System.out.println("Нет места для добавления нового студента.");
        }
    }

    public void displayStudents() {
        if (currentSize == 0) {
            System.out.println("Нет студентов в базе.");
        } else {
            System.out.println("Список студентов:");
            for (int i = 0; i < currentSize; i++) {
                System.out.println(freshmen[i].getStudentInfo());
            }
        }
    }

    public static void main(String[] args) {
        UniversityStudents university = new UniversityStudents(5);

        university.addStudent(Student.createStudent("Иван", "Иванов", 18));
        university.addStudent(Student.createStudent("Мария", "Петрова", 19));
        university.addStudent(Student.createStudent("Алексей", "Смирнов", 20));

        System.out.println("До добавления нового студента:");
        university.displayStudents();

        Student newStudent = Student.createStudent("Сергей", "Кузнецов", 18);
        university.addStudent(newStudent);

        System.out.println("\nПосле добавления нового студента:");
        university.displayStudents();
    }
}

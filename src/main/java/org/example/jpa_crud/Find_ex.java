package org.example.jpa_crud;

import jakarta.persistence.*;
import org.example.entity.Student;

public class Find_ex {
    public static void main(String[] args) {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("jpa-course");
        EntityManager entityManager = factory.createEntityManager();

        Student student = null;

        try {
            student = entityManager.find(Student.class, 5);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (entityManager != null) {
                entityManager.close();
                factory.close();
            }
        }
        System.out.println(student);
    }
}

package org.example.crud.jpa_crud;

import jakarta.persistence.*;
import org.example.crud.entity.Student;

public class Persist_ex {
    public static void main(String[] args) {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("jpa-course");
        EntityManager entityManager = factory.createEntityManager();

        EntityTransaction transaction = entityManager.getTransaction();
        Student student = null;

        try {
            transaction.begin();
            student = new Student("Chanel", "King", 8.0);
            entityManager.persist(student);
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
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

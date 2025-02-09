package org.example.relationships.one_to_one;

import jakarta.persistence.*;
import org.example.relationships.one_to_one.entity.Passport;
import org.example.relationships.one_to_one.entity.Student;

public class OneToOneUni {
    public static void main(String[] args) {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("jpa-course");
        EntityManager entityManager = factory.createEntityManager();

        EntityTransaction transaction = entityManager.getTransaction();

        try {
            transaction.begin();

            Student student1 = new Student("Julia", "Dean", 8.7);
            Passport passport1 = new Passport("julia.dean@gmail.com", 168, "green");
            student1.setPassport(passport1);

            entityManager.persist(passport1);
            entityManager.persist(student1);

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
    }
}

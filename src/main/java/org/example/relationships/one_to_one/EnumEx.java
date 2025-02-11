package org.example.relationships.one_to_one;

import jakarta.persistence.*;
import org.example.relationships.one_to_one.entity.Student;

public class EnumEx {
    public static void main(String[] args) {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("jpa-course");
        EntityManager entityManager = factory.createEntityManager();

        EntityTransaction transaction = entityManager.getTransaction();

        try {
            transaction.begin();

//            Student student = new Student("Eric", "Scott", 7.4);
//            Passport passport = new Passport("eric.scott@yahoo.com", 173, EyeColor.GREEN);
//
//            student.setPassport(passport);
//
//            entityManager.persist(student);

            Student student = entityManager.find(Student.class, 1);
            System.out.println(student.getPassport());

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

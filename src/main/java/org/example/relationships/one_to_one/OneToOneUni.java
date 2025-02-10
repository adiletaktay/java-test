package org.example.relationships.one_to_one;

import jakarta.persistence.*;
import org.example.relationships.one_to_one.entity.Student;

public class OneToOneUni {
    public static void main(String[] args) {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("jpa-course");
        EntityManager entityManager = factory.createEntityManager();

        EntityTransaction transaction = entityManager.getTransaction();

        try {
            transaction.begin();
//            PERSIST
//            Student student1 = new Student("Isaac", "Sharp", 9.8);
//            Passport passport1 = new Passport("isaac.sharp@eahoo.com", 183, "blue");
//            student1.setPassport(passport1);

//            entityManager.persist(passport1);
//            entityManager.persist(student1);

//            FIND
//            Student student = entityManager.find(Student.class, 100);
//            System.out.println(student);
//            System.out.println(student.getPassport());

//            REMOVE
            Student student = entityManager.find(Student.class, 2);
            entityManager.remove(student);

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

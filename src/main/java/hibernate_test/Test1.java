package hibernate_test;

import com.mysql.cj.Session;
import com.mysql.cj.xdevapi.SessionFactory;
import hibernate_test.entity.Employee;
import org.hibernate.cfg.Configuration;

public class Test1 {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory();

        try {
            Session session = factory.getCurrentSession();
            Employee emp = new Employee("Adi", "Aktay", "IT", 500);
            session.beginTransaction();
            session.persist(emp);
            session.getTransaction().commit();
        } finally {
            factory.close();
        }
    }
}

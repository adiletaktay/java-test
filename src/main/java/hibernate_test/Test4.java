package hibernate_test;

import com.mysql.cj.Session;
import com.mysql.cj.xdevapi.SessionFactory;
import hibernate_test.entity.Employee;
import org.hibernate.cfg.Configuration;

public class Test4 {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory();

        try {
            Session session = factory.getCurrentSession();
            session.beginTransaction();
//            Employee employee = session.get(Employee.class, 1);
//            employee.setSalary(1500);
            session.createQuery("update Employee set salary=1000 where firstName='Aleksandr'").executeUpdate();
            session.getTransaction().commit();
        } finally {
            factory.close();
        }
    }
}

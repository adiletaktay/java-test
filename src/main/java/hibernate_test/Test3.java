package hibernate_test;

import com.mysql.cj.Session;
import com.mysql.cj.xdevapi.SessionFactory;
import hibernate_test.entity.Employee;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class Test3 {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory();

        try {
            Session session = factory.getCurrentSession();
            session.beginTransaction();

            List<Employee> emps = session.createQuery("from Employee " + "where name = 'Aleksandr' AND salary>650")
                    .getResultList();

            for (Employee e : emps) {
                System.out.println(e);
            }

            session.getTransaction().commit();
        } finally {
            factory.close();
        }
    }
}

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import javax.ws.rs.core.Configuration;

/**
 * Created by saazimi on 09/08/2018.
 */
public class main {
    public static void main(String []args){
        Student student = new Student();
        student.setUsername("Ali Azimi");


        Vehicle vehicle = new Vehicle();
        vehicle.setVName("H30 Cross");
        student.setStudent_vehicle(vehicle);

        SessionFactory factory = new org.hibernate.cfg.Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
        Session session = factory.openSession();
        session.beginTransaction();
        session.save(student);
        session.save(vehicle);
        session.getTransaction().commit();
        session.close();
    }
}

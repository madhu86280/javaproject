package DAO;

import org.hibernate.*;
import org.hibernate.cfg.Configuration;


public class AdduserDAO {
    Student s = null;
    Configuration cf = null;
    SessionFactory sf = null;
    Session session = null;
    public void add(String username,String password){
        try{
            cf = new Configuration();
            cf.configure("Student.cfg.xml");
            sf = cf.buildSessionFactory();
            session = sf.openSession();
            Transaction tx = session.beginTransaction();
            s = new Student();
            s.setUsername(username);
            s.setPassword(password);
            session.save(s);
            tx.commit();
        } catch(Exception e ){
            System.out.println(e);
            e.printStackTrace();
        } finally{
            session.close();
            sf.close();
        }
    }
}

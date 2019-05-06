
package Demo;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import org.hibernate.Session;
import org.hibernate.cfg.Configuration;
@ManagedBean
@SessionScoped

public class Data {
    
    private Members m;
    private HibernateUtil helper;
    private Session session;
    
    public void addMember()
    {
        m=new Members("madhu");
        Configuration cfg= new Configuration();
        cfg.configure("Resource/hibernate.cfg.xml");
        session=helper.getSessionFactory().openSession();
        session.beginTransaction();
        session.save(m);
        session.getTransaction().commit();
        session.close();
    }
}


package DAO;

import Bean.Stu;
import java.util.*;
import org.hibernate.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;


public class StudentOperation implements StudentDeclaration {

    SessionFactory sf;
    Session ss;
    Transaction tr;

    public StudentOperation() {
        sf = HelpingClasses.SessionFact.getSessionFact();
        ss = sf.openSession();
    }

    @Override
    public long insertStudent(Stu st) {
        tr = ss.beginTransaction();
        System.err.println(" " + st.gettype());
        long l = (Long) ss.save(st);
        tr.commit();
        if (l > 0) {
            return 1;
        } else {
            return 0;
        }
    }

    @Override
    public long upDate(long id, Stu st) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean delete(long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Stu selectStudent(long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List selectAllStudents() {
        tr = ss.beginTransaction();
        String hql = "from Bean.Student";
        Query query = ss.createQuery(hql);
        List<Stu> li = query.list();
        ListIterator lit = li.listIterator();
        if (li.size() > 0) {
            return li;
        }
        return null;
    }

    @Override
    public ArrayList searchByName(String name) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public static void main(String[] args) {
        StudentOperation ope = new StudentOperation();
        ope.selectAllStudents();
    }
}
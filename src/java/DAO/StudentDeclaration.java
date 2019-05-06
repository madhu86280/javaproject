
package DAO;

import Bean.Stu;
import java.util.*;


public interface StudentDeclaration {
   public long insertStudent(Stu st);
   public long upDate(long id,Stu st);
   public boolean delete (long id);
   public Stu selectStudent(long id);
   public List selectAllStudents();
   public ArrayList searchByName(String name);
   
}


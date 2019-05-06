
package Bean;

import java.io.Serializable;
import javax.persistence.*;

@Entity
public class Stu implements Serializable {
   @Id
   @GeneratedValue
   private long s_id;
   
   @Column(unique=true,nullable=false)
   private String username;
   @Column(nullable=false)
   private String password;
   @Column(nullable=false)   
   private String type;
   
    public String gettype() {
        return type;
    }

    public void setName(String type) {
        this.type = type;
    }
  
    public Stu() {
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    public Stu(String type,String username, String password) {
        this.username = username;
        this.password = password;
        this.type = type;
    }
}
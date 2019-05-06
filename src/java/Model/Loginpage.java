
package Model;

import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class Loginpage {
    
     @Id
    @Column(unique=true)
    String name;
    String pass;
   
    

    public String getname() {
        return name;
    }

    public void setname(String name) {
        this.name = name;
    }

    
    

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

  
    
    @Override
    public boolean equals(Object o) {
        Loginpage u = (Loginpage) o;
        return this.name.equals(name) && this.pass.equals(pass);
    }
    
}

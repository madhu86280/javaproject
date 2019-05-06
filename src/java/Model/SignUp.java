
package Model;

import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class SignUp {
    String fname;
    String lname;
    @Id
    @Column(unique=true)
    String email;
    String pass;
    String cpass;
    String usertype;

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getCpass() {
        return cpass;
    }

    public void setCpass(String cpass) {
        this.cpass = cpass;
    }

    public String getUsertype() {
        return usertype;
    }

    public void setUsertype(String usertype) {
        this.usertype = usertype;
    }
    @Override
    public boolean equals(Object o) {
        SignUp u = (SignUp) o;
        return this.email.equals(u.email) && this.pass.equals(u.pass) && this.usertype.equals(u.usertype);
    }
    
}


package Demo;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Members {
    @Id
    private int id;
    private String name;
    public Members(String name)
    {
        this.name=name;
    }

    public Members() {
        
    }

    public int getId() {
        return id;  
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
}

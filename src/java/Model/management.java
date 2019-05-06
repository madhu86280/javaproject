/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author Dell Store Una
 */
@Entity
public class management {
  

    @Id
    int busno;
    String busro,bustime;

    public int getBusno() {
        return busno;
    }

    public void setBusno(int busn) {
        this.busno = busno;
    }

    public String getBusro() {
        return busro;
    }

    public void setBusro(String busro) {
        this.busro = busro;
    }

    public String getBustime() {
        return bustime;
    }

    public void setBustime(String bustime) {
        this.bustime = bustime;
    }
    
    
}

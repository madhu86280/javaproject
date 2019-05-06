/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class schedule {
    @Id
    int busn;
    String busr,pickup,time;

    public int getBusn() {
        return busn;
    }

    public void setBusn(int busn) {
        this.busn = busn;
    }

    public String getBusr() {
        return busr;
    }

    public void setBusr(String busr) {
        this.busr = busr;
    }

    public String getPickup() {
        return pickup;
    }

    public void setPickup(String pick) {
        this.pickup = pickup;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    
    
}

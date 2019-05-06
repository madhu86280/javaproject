/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Bean.Bus;
import java.util.ArrayList;
import java.util.List;


public interface BusDeclaration {
    public long insertBus(Bus st);
    public long upDate(long id,Bus st);
    public boolean deleteinfo(long id);
    public Bus selectBus(long id);
    public List selectAllBus();
    public ArrayList searchByName(String name);
    
}

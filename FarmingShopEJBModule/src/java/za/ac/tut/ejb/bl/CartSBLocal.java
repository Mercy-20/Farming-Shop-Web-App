/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/J2EE/EJB30/SessionLocal.java to edit this template
 */
package za.ac.tut.ejb.bl;

import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author LEBO MERCY MOGALE
 */
@Local
public interface CartSBLocal {
    
    void addItem(String item);
    
    List<String> getItems();
    
    List<String> emptyList();
    
    void setList(List<String> cart);
}

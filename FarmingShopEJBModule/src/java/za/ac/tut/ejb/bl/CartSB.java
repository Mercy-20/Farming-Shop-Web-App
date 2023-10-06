/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/J2EE/EJB30/StatelessEjbClass.java to edit this template
 */
package za.ac.tut.ejb.bl;

import java.util.ArrayList;
import java.util.List;
import javax.ejb.Stateless;

/**
 *
 * @author LEBO MERCY MOGALE
 */
@Stateless
public class CartSB implements CartSBLocal {

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
    
     private List<String> cart = new ArrayList<>();

    public CartSB() {
    }
    
    @Override
    public void addItem(String item) {
        cart.add(item);
    }

    @Override
    public List<String> getItems() {
        return cart;
    }
    
    @Override
    public List<String> emptyList() {
        cart.clear();
        return cart;
    }
    
    @Override
    public void setList(List<String> cart) {
        this.cart = cart;
    }
}

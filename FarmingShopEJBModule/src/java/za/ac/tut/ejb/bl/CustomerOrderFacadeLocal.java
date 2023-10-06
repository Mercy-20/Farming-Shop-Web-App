/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package za.ac.tut.ejb.bl;

import java.util.Date;
import java.util.List;
import javax.ejb.Local;
import za.ac.tut.entities.CustomerOrder;

/**
 *
 * @author LEBO MERCY MOGALE
 */
@Local
public interface CustomerOrderFacadeLocal {

    void create(CustomerOrder customerOrder);

    void edit(CustomerOrder customerOrder);

    void remove(CustomerOrder customerOrder);

    CustomerOrder find(Object id);

    List<CustomerOrder> findAll();

    List<CustomerOrder> findRange(int[] range);

    int count();
    
    List<CustomerOrder> findAllOrdersByDate(Date date);
    
    List<CustomerOrder> findAllByOrderValuesRange(Double minPrice, Double maxPrice);
    
}

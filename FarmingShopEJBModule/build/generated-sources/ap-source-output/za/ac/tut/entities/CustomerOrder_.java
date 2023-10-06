package za.ac.tut.entities;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import za.ac.tut.entities.Address;

@Generated(value="EclipseLink-2.7.10.v20211216-rNA", date="2023-05-26T10:24:47")
@StaticMetamodel(CustomerOrder.class)
public class CustomerOrder_ { 

    public static volatile SingularAttribute<CustomerOrder, Address> customerAddress;
    public static volatile ListAttribute<CustomerOrder, String> orderedItems;
    public static volatile SingularAttribute<CustomerOrder, Long> id;
    public static volatile SingularAttribute<CustomerOrder, Date> creationDate;
    public static volatile SingularAttribute<CustomerOrder, Double> orderValue;

}
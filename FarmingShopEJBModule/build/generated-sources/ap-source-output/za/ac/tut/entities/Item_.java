package za.ac.tut.entities;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.10.v20211216-rNA", date="2023-05-26T10:24:47")
@StaticMetamodel(Item.class)
public class Item_ { 

    public static volatile SingularAttribute<Item, Double> unitPrice;
    public static volatile SingularAttribute<Item, Integer> code;
    public static volatile SingularAttribute<Item, Integer> quantity;
    public static volatile SingularAttribute<Item, String> description;
    public static volatile SingularAttribute<Item, Long> id;
    public static volatile SingularAttribute<Item, Date> creatiionDate;

}
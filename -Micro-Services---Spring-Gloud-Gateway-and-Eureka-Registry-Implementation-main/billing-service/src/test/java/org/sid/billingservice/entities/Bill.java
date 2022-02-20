package org.sid.billingservice.entities;

import org.sid.billingservice.model.Customer;

import javax.persistence.*;
import javax.xml.crypto.Data;
import java.util.Collection;
import java.util.Date;
@Entity
public class Bill {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Date billingDate;
    @OneToMany(mappedBy = "bill")
    private Collection<ProductItem> productItems;
    private long customerID;
    @Transient
    private Customer customer;


}

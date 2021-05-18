package org.vakarcs.tamas.Model.Order;

import org.vakarcs.tamas.Customer;

import java.util.Date;
import java.util.List;
import java.util.UUID;

public class Order {
    private Customer customer;
    private Date deadline;
    private List<OrderElement> orderList;
    private UUID orderID;

    public Order(Customer customer, Date deadline, List<OrderElement> orderList) {
        this.customer = customer;
        this.deadline = deadline;
        this.orderList = orderList;
        this.orderID = UUID.randomUUID();
    }

    public Customer getCustomer()
    {
        return customer;
    }
    public List<OrderElement> getOrderList()
    {
        return orderList;
    }
    public UUID getOrderID(){
        return orderID;
    }
}

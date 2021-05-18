package org.vakarcs.tamas.Controller;

import org.vakarcs.tamas.Customer;
import org.vakarcs.tamas.Model.Order.Order;
import org.vakarcs.tamas.Model.Order.OrderBuilderImpl;
import org.vakarcs.tamas.Model.Order.OrderElement;

import java.util.Date;
import java.util.List;

public class OrderController {
    private Customer customer;
    private Date deadline;
    private List<OrderElement> orderList;
    public OrderController(Customer customer, Date deadline, List<OrderElement> orderList){
        this.customer = customer;
        this.deadline = deadline;
        this.orderList = orderList;
    }

    public Order MakeOrder()
    {
        OrderBuilderImpl orderBuilder = new OrderBuilderImpl();
        return orderBuilder.setCustomer(customer)
                    .setDeadline(deadline)
                    .setOrderList(orderList)
                    .build();
    }
}

package org.vakarcs.tamas.Model.Order;

import org.vakarcs.tamas.Customer;

import java.util.Date;
import java.util.List;

public class OrderBuilderImpl implements OrderBuilder{
    private OrderBuilderImpl orderBuilder;

    private Customer customer;
    private Date deadline;
    private List<OrderElement> orderList;

    @Override
    public OrderBuilderImpl setCustomer(Customer customer)
    {
        this.customer = customer;
        return this;
    }
    @Override
    public OrderBuilderImpl setDeadline(Date deadline)
    {
        this.deadline = deadline;
        return this;
    }
    @Override
    public OrderBuilderImpl setOrderList(List<OrderElement> orderList)
    {
        this.orderList = orderList;
        return this;
    }
    @Override
    public Order build()
    {
        return new Order(customer,deadline,orderList);
    }
}

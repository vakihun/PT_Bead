package org.vakarcs.tamas.Interface;

import org.vakarcs.tamas.Customer;
import org.vakarcs.tamas.Model.Order.Order;
import org.vakarcs.tamas.Model.Order.OrderBuilderImpl;
import org.vakarcs.tamas.Model.Order.OrderElement;

import java.util.Date;
import java.util.List;

public interface OrderBuilder {
    OrderBuilderImpl setCustomer(Customer customer);
    OrderBuilderImpl setDeadline(Date deadline);
    OrderBuilderImpl setOrderList(List<OrderElement> orderList);
    Order build();
}

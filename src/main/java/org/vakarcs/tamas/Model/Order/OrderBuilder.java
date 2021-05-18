package org.vakarcs.tamas.Model.Order;

import org.vakarcs.tamas.Customer;

import java.util.Date;
import java.util.List;

public interface OrderBuilder {
    OrderBuilderImpl setCustomer(Customer customer);
    OrderBuilderImpl setDeadline(Date deadline);
    OrderBuilderImpl setOrderList(List<OrderElement> orderList);
    Order build();
}

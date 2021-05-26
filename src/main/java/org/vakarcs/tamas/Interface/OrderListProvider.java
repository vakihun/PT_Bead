package org.vakarcs.tamas.Interface;

import org.vakarcs.tamas.Customer;
import org.vakarcs.tamas.Model.Order.OrderElement;

import java.io.IOException;
import java.util.List;

public interface OrderListProvider {
    List<OrderElement> getOrderList(Customer customer) throws IOException;
}

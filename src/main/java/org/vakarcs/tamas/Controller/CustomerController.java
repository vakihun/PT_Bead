package org.vakarcs.tamas.Controller;

import org.vakarcs.tamas.Model.Order.Order;
import org.vakarcs.tamas.Model.Warehouse.FinishedProductWarehouse;

public class CustomerController {
    private Order order;

    public CustomerController(Order order)
    {
        this.order = order;

    }
    public void Buy()
    {
        order.getCustomer().Buy(order,FinishedProductWarehouse.getInstance());
    }
}

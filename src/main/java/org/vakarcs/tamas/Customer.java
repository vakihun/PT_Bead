package org.vakarcs.tamas;

import org.vakarcs.tamas.Model.Order.OrderElement;
import org.vakarcs.tamas.Model.Order.Order;
import org.vakarcs.tamas.Model.Warehouse.FinishedProductWarehouse;

import java.util.List;
import java.util.UUID;

public class Customer {
    private String name;
    private UUID customerID;

    public Customer(String name) {
        this.name = name;
        this.customerID = UUID.randomUUID();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UUID getCustomerID() {
        return customerID;
    }

    public void setCustomerID(UUID customerID) {
        this.customerID = customerID;
    }

    public void Buy(Order orderList, FinishedProductWarehouse finishedProductWarehouse)
    {
        List<OrderElement> orderElementList = orderList.getOrderList();
        for(int i = 0;i<orderElementList.size();i++)
        {
            OrderElement orderElement = orderElementList.get(i);
            finishedProductWarehouse.Expenditure(orderElement.getProductName(),orderElement.getQuantity());
        }
    }
}

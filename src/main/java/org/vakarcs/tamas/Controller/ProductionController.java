package org.vakarcs.tamas.Controller;

import org.vakarcs.tamas.Model.Order.OrderElement;
import org.vakarcs.tamas.Model.Product.FinishedProductFactoryImpl;
import org.vakarcs.tamas.Model.Warehouse.FinishedProductWarehouse;
import org.vakarcs.tamas.Model.Warehouse.RawMaterialWarehouse;
import org.vakarcs.tamas.Producer;

import java.util.List;

public class ProductionController {
    private List<OrderElement> orderList;

    public ProductionController(List<OrderElement> orderList)
    {
        this.orderList = orderList;
    }

    public void Start()
    {
        Producer producer = new Producer(new FinishedProductFactoryImpl());
        producer.Produce(orderList, RawMaterialWarehouse.getInstance(), FinishedProductWarehouse.getInstance());
    }
}

package org.vakarcs.tamas;

import org.vakarcs.tamas.Model.Order.OrderElement;
import org.vakarcs.tamas.Model.Product.FinishedProduct;
import org.vakarcs.tamas.Model.Product.FinishedProductFactory;
import org.vakarcs.tamas.Model.Warehouse.FinishedProductWarehouse;
import org.vakarcs.tamas.Model.Warehouse.RawMaterialWarehouse;

import java.util.List;

public class Producer {
    private FinishedProductFactory finishedProductFactory;
    public Producer(FinishedProductFactory finishedProductFactory)
    {
        this.finishedProductFactory = finishedProductFactory;
    }
    public void Produce(List<OrderElement> orderList, RawMaterialWarehouse rawMaterialWarehouse, FinishedProductWarehouse finishedProductWarehouse)
    {
        for(int i = 0;i<orderList.size();i++)
        {
            OrderElement orderElement = orderList.get(i);
            FinishedProduct finishedProduct = finishedProductFactory.Create(orderElement.getProductCategory());
            rawMaterialWarehouse.Expenditure(finishedProduct.getRequiredRawMaterial(), orderElement.getQuantity());
            finishedProductWarehouse.Revenue(finishedProduct,orderElement.getQuantity());
        }
    }

}

package org.vakarcs.tamas;

import org.vakarcs.tamas.Model.Product.RawMaterial;
import org.vakarcs.tamas.Model.Warehouse.RawMaterialWarehouse;

public class Supplier {
    public void Supply(RawMaterial rawMaterial,RawMaterialWarehouse rawMaterialWarehouse, int quantity)
    {
        rawMaterialWarehouse.Revenue(rawMaterial,quantity);
    }
}

package org.vakarcs.tamas.Controller;

import org.vakarcs.tamas.Model.Product.RawMaterial;
import org.vakarcs.tamas.Model.Warehouse.RawMaterialWarehouse;
import org.vakarcs.tamas.Supplier;

public class SupplierController {

    private final Supplier supplier;
    private int quantity;
    private RawMaterial rawMaterial;

    public SupplierController(RawMaterial rawMaterial, int quantity)
    {
        this.supplier = rawMaterial.getSupplier();
        this.quantity = quantity;
        this.rawMaterial = rawMaterial;
    }

    public void Supply()
    {
        supplier.Supply(rawMaterial,RawMaterialWarehouse.getInstance(),quantity);
    }
}

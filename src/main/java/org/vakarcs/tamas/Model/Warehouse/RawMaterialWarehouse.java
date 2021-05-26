package org.vakarcs.tamas.Model.Warehouse;

import org.vakarcs.tamas.Interface.Warehouse;

public class RawMaterialWarehouse implements Warehouse {
    private static RawMaterialWarehouse instance = null;

    private RawMaterialWarehouse(){}

    public static synchronized RawMaterialWarehouse getInstance(){
        if (instance == null){
            instance = new RawMaterialWarehouse();
        }
        return instance;
    }
    @Override
    public void Revenue(Object o,int quantity)
    {
        System.out.println(quantity+" piece of raw materials were received.");
    }
    @Override
    public void Expenditure(Object o, int quantity)
    {
        System.out.println(quantity+" piece of raw materials were expenditured.");
    }
}

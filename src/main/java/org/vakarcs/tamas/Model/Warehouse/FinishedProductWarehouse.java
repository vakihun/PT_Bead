package org.vakarcs.tamas.Model.Warehouse;

public class FinishedProductWarehouse implements Warehouse {
    private static FinishedProductWarehouse instance = null;

    private FinishedProductWarehouse(){}

    public static synchronized FinishedProductWarehouse getInstance(){
        if (instance == null){
            instance = new FinishedProductWarehouse();
        }
        return instance;
    }
    @Override
    public void Revenue(Object o, int quantity)
    {
        System.out.println(quantity+" piece of finished products were received.");
    }
    @Override
    public void Expenditure(Object o, int quantity)
    {
        System.out.println(quantity+" piece of finished products were expenditured.");
    }
}

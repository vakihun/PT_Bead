package org.vakarcs.tamas.Model.Order;

import java.util.UUID;

public class OrderElement {
    private String productName;
    private String productCategory;
    private int quantity;

    public String getProductName()
    {
        return productName;
    }

    public String getProductCategory()
    {
        return productCategory;
    }

    public int getQuantity()
    {
        return quantity;
    }
}

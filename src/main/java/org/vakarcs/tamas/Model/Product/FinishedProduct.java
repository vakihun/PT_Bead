package org.vakarcs.tamas.Model.Product;

import java.util.Date;
import java.util.UUID;

public class FinishedProduct extends Product{
    protected String category;
    protected UUID productionID;
    protected Date productionTime;
    protected RawMaterial requiredRawMaterial;

    public RawMaterial getRequiredRawMaterial() {
        return requiredRawMaterial;
    }
}

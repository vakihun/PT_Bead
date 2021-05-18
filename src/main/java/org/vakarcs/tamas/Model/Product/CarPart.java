package org.vakarcs.tamas.Model.Product;

import java.util.Date;
import java.util.UUID;

public class CarPart extends FinishedProduct{
    public CarPart() {
        this.name="CarPart";
        this.category="CarPart";
        this.productionID = UUID.randomUUID();
        this.productionTime = new Date();
    }
}

package org.vakarcs.tamas.Model.Product;

import java.util.Date;
import java.util.UUID;

public class Computer extends FinishedProduct{
    public Computer() {
        this.name="Computer";
        this.category="Computer";
        this.productionID = UUID.randomUUID();
        this.productionTime = new Date();
    }
}

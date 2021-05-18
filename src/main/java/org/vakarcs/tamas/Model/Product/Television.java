package org.vakarcs.tamas.Model.Product;

import java.util.Date;
import java.util.UUID;

public class Television extends FinishedProduct {
    public Television() {
        this.name="Television";
        this.category="Television";
        this.productionID = UUID.randomUUID();
        this.productionTime = new Date();
    }
}

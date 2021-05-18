package org.vakarcs.tamas.Model.Product;

import java.util.Date;
import java.util.UUID;

public class Toy extends FinishedProduct {
    public Toy() {
        this.name="Toy";
        this.category="Toy";
        this.productionID = UUID.randomUUID();
        this.productionTime = new Date();
    }
}

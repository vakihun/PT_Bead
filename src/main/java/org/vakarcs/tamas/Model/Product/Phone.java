package org.vakarcs.tamas.Model.Product;

import java.util.Date;
import java.util.UUID;

public class Phone extends FinishedProduct {
    public Phone() {
            this.name="Phone";
            this.category="Phone";
            this.productionID = UUID.randomUUID();
            this.productionTime = new Date();
    }
}

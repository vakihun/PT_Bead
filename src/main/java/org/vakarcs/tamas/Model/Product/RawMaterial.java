package org.vakarcs.tamas.Model.Product;

import org.vakarcs.tamas.Supplier;

import java.util.UUID;

public class RawMaterial {
    protected String name;
    protected UUID id;
    protected Supplier supplier;

    public RawMaterial(String name, Supplier supplier) {
        this.name = name;
        this.supplier = supplier;
        this.id = UUID.randomUUID();
    }

    public String getName()
    {
        return name;
    }
    public Supplier getSupplier()
    {
        return supplier;
    }
    public UUID getId()
    {
        return id;
    }
}

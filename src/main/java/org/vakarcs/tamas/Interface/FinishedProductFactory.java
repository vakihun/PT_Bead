package org.vakarcs.tamas.Interface;

import org.vakarcs.tamas.Model.Product.FinishedProduct;

public interface FinishedProductFactory {
    FinishedProduct Create(String category);
}

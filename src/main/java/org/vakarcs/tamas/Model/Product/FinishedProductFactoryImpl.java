package org.vakarcs.tamas.Model.Product;

public class FinishedProductFactoryImpl implements FinishedProductFactory{
    @Override
    public FinishedProduct Create(String category) {
        FinishedProduct finishedProduct = null;
        switch(category)
        {
            case "Toy":
                finishedProduct = new Toy();
            break;

            case "Television":
                finishedProduct = new Television();
            break;

            case "Phone":
                finishedProduct = new Phone();
            break;

            case "CarPart":
                finishedProduct = new CarPart();
            break;

            case "Computer":
                finishedProduct = new Computer();
            break;
        }
        return finishedProduct;
    }
}

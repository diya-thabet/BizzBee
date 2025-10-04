package kawn.bizzbee.entity.inventory;


import kawn.bizzbee.entity.product.Product;
import kawn.bizzbee.entity.product.ProductDAO;

import java.util.ArrayList;
import java.util.List;

public class InventoryManager {
    private List<InventoryObserver> observers = new ArrayList<>();
    private ProductDAO productDAO;

    public InventoryManager(ProductDAO productDAO) {
        this.productDAO = productDAO;
    }

    public void addProduct(Product product) {
        productDAO.addProduct(product);
        notifyObservers(product);
    }

    public void updateProduct(Product product) {
        productDAO.updateProduct(product);
        notifyObservers(product);
    }

    public void attach(InventoryObserver observer) {
        observers.add(observer);
    }

    public void detach(InventoryObserver observer) {
        observers.remove(observer);
    }

    private void notifyObservers(Product product) {
        for (InventoryObserver observer : observers) {
            observer.update(product);
        }
    }
}
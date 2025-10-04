package kawn.bizzbee.entity.inventory;

import kawn.bizzbee.entity.product.Product;

public interface InventoryObserver {
    void update(Product product);
}
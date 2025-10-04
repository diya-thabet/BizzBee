package kawn.bizzbee.entity;

import java.util.List;

// ProductDAO.java
public interface ProductDAO {
    void addProduct(Product product);
    void updateProduct(Product product);
    void deleteProduct(int id);
    Product getProduct(int id);
    List<Product> getAllProducts();
}
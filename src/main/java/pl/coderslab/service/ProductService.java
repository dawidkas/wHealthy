package pl.coderslab.service;

import pl.coderslab.model.Product;

import java.util.List;

public interface ProductService {

    Product findProductByName(String name);
    List<Product> findAllProducts();
    void add(Product product);
    void deleteProduct(long id);
}
package pl.coderslab.service;

import pl.coderslab.model.Product;
import pl.coderslab.model.ProductWithWeight;

import java.util.List;

public interface ProductWithWeightService {

    ProductWithWeight findById(long id);
    List<ProductWithWeight> findAll();
    void add(ProductWithWeight productWithWeight);
    void delete(long id);
}
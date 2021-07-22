package pl.coderslab.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
import pl.coderslab.model.Product;
import pl.coderslab.model.ProductWithWeight;
import pl.coderslab.repository.ProductWithWeightRepository;

import java.util.List;

@Service
@Primary
public class ProductWithWeightServiceImpl implements ProductWithWeightService {

    private final ProductWithWeightRepository productWithWeightRepository;

    public ProductWithWeightServiceImpl(ProductWithWeightRepository productWithWeightRepository) {
        this.productWithWeightRepository = productWithWeightRepository;
    }

    @Override
    public ProductWithWeight findById(long id) {
        return productWithWeightRepository.findProductWithWeightById(id);
    }

    @Override
    public List<ProductWithWeight> findAll() {
        return productWithWeightRepository.findAll();
    }

    @Override
    public void add(ProductWithWeight productWithWeight) {
    }

    @Override
    public void setWeight(Product product, double weight) {
        ProductWithWeight productWithWeight = new ProductWithWeight();
        productWithWeight.setProduct(product);
        productWithWeight.setWeight(weight);
        productWithWeightRepository.save(productWithWeight);
    }

    @Override
    public void delete(long id) {
    }
}
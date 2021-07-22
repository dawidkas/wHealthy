package pl.coderslab.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
import pl.coderslab.model.ProductWithWeight;
import pl.coderslab.repository.ProductRepository;
import pl.coderslab.repository.ProductWithWeightRepository;

import java.util.List;

@Service
@Primary
public class ProductWithWeightServiceImpl implements ProductWithWeightService {

    private final ProductWithWeightRepository productWithWeightRepository;
    private final ProductRepository productRepository;

    public ProductWithWeightServiceImpl(ProductWithWeightRepository productWithWeightRepository, ProductRepository productRepository) {
        this.productWithWeightRepository = productWithWeightRepository;
        this.productRepository = productRepository;
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
    public void delete(long id) {
    }
}
package pl.coderslab.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
import pl.coderslab.model.Product;
import pl.coderslab.repository.ProductRepository;

import java.util.List;

@Service
@Primary
public class JpaProductService implements ProductService {

    private final ProductRepository productRepository;

    public JpaProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public Product findProductByName(String name) {
        return productRepository.findProductByName(name);
    }

    @Override
    public void add(Product product) {
        productRepository.save(product);
    }

    @Override
    public void deleteProduct(long id) {
        productRepository.deleteById(id);
    }

    @Override
    public List<Product> findAllProducts() {
        return productRepository.findAll();
    }
}
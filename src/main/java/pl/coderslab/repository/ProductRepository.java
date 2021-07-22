package pl.coderslab.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import pl.coderslab.model.Product;
import pl.coderslab.model.User;

public interface ProductRepository extends JpaRepository<Product, Long> {

    @Query("SELECT p FROM Product p WHERE p.name =?1")
    Product findProductByName(String username);

    @Query("SELECT p FROM Product p WHERE p.id =?1")
    Product findProductById(long id);
}
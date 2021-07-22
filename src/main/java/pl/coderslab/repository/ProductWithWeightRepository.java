package pl.coderslab.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import pl.coderslab.model.ProductWithWeight;

public interface ProductWithWeightRepository extends JpaRepository<ProductWithWeight, Long> {

    @Query("SELECT pww FROM Product pww WHERE pww.id =?1")
    ProductWithWeight findProductWithWeightById(long id);
}

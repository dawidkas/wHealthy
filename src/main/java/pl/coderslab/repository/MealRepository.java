package pl.coderslab.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.coderslab.model.Meal;

public interface MealRepository extends JpaRepository<Meal, Long> {
}

package pl.coderslab.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.coderslab.model.UserDetail;

public interface UserDetailsRepository extends JpaRepository<UserDetail, Long> {
}

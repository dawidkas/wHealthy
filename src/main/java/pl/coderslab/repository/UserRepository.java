package pl.coderslab.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import pl.coderslab.model.User;

public interface UserRepository extends JpaRepository<User, Long> {

    @Query("SELECT u FROM User u WHERE u.id =?1")
    User findUserById(long id);

    @Query("SELECT u FROM User u WHERE u.username =?1")
    User findUserByUsername(String username);

    @Query("SELECT u FROM User u WHERE u.email =?1")
    User findUserByEmail(String email);
}
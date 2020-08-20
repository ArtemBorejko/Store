package store.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import store.entities.User;

public interface UserRepository extends JpaRepository<User, Integer> {
    User getUserByUsername(String username);
    User getUserById(Integer idOfUser);
    Integer add(User user);
}

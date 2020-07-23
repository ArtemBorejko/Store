package store.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import store.entities.Client;

public interface ClientRepository extends JpaRepository<Client, Integer> {
        Client getByIdOfClient(int idOfClient);
}

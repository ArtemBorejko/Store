package store.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import store.entities.Provider;

public interface ProviderRepository extends JpaRepository<Provider, Integer> {
    Provider getByIdOfProvider(int idOfProvider);
}

package store.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import store.entities.Item;

public interface ItemRepository extends JpaRepository<Item, Integer> {

}

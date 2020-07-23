package store.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import store.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Integer> {
    Order getByIdOfOrder(int idOfOrder);
}

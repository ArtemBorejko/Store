package store.services;

import store.entities.Order;
import java.util.List;

public interface OrderService {

    List<Order> findAll();

    Order save(Order order);

    Order update(Order order);

    void delete(int idOfOrder);

    Order getById(int IdOfOrder);
}

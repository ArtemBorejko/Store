package store.dao;

import store.entities.Order;

import java.util.List;

public interface OrderDao {
    void save(Order order);

    Order getById(int idOfOrder);

    List<Order> findAll();

    void update(Order order);

    void delete(int idOfOrder);
}

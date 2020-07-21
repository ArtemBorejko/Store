package store.dao;

import org.springframework.jdbc.core.JdbcTemplate;
import store.entities.Order;

import java.util.List;

public class OrderDaoImpl implements OrderDao {
    public final JdbcTemplate jdbcTemplate;

    public OrderDaoImpl(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public void save(Order order) {

    }

    public Order getById(int idOfOrder) {
        return null;
    }

    public List<Order> findAll() {
        return null;
    }

    public void update(Order order) {

    }

    public void delete(int idOfOrder) {

    }
}

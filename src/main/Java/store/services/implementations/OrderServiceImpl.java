package store.services.implementations;

import org.springframework.stereotype.Service;
import store.entities.Order;
import store.repositories.OrderRepository;
import store.services.OrderService;

import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {
    private OrderRepository orderRepository;

    public OrderServiceImpl(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    @Override
    public List<Order> findAll() {
        return orderRepository.findAll();
    }

    @Override
    public Order save(Order order) {
        return orderRepository.save(order);
    }

    @Override
    public Order update(Order order) {
        return orderRepository.saveAndFlush(order);
    }

    @Override
    public void delete(int idOfOrder) {
        orderRepository.deleteById(idOfOrder);
    }

    @Override
    public Order getById(int idOfOrder) {
        return orderRepository.getOne(idOfOrder);
    }
}

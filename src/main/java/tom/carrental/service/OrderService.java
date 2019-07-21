package tom.carrental.service;

import java.util.List;
import org.springframework.stereotype.Service;
import tom.carrental.model.Order;
import tom.carrental.repository.OrderRepository;

@Service
public class OrderService {

    private OrderRepository orderRepository;

    public OrderService(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    public List<Order> findAll() {

        List<Order> orders = orderRepository.findAll();
        return orders;
    }

    public Order find(int id) {

        Order order = orderRepository.findById(id).get();
        return order;
    }

    public void save(Order order) {

        orderRepository.save(order);
    }

    public void delete(int id) {

        orderRepository.deleteById(id);
    }
}

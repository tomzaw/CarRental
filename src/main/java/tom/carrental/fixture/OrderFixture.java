package tom.carrental.fixture;

import java.time.LocalDateTime;
import javax.annotation.PostConstruct;
import org.springframework.stereotype.Component;
import tom.carrental.model.AppUser;
import tom.carrental.model.Client;
import tom.carrental.model.Order;
import tom.carrental.repository.OrderRepository;

@Component
public class OrderFixture {

    private OrderRepository orderRepository;

    public OrderFixture(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    @PostConstruct
    public void init() {
        /*
        Order order1 = new Order(LocalDateTime.parse("2019-07-01T20:00:00"), LocalDateTime.parse("2019-07-10T20:00:00"),
                "Card", "Car Rent", "Car Rent", new AppUser(), new Client());

        Order order2 = new Order(LocalDateTime.parse("2019-07-01T20:00:00"), LocalDateTime.parse("2019-07-10T20:00:00"),
                "Card", "Car Rent", "Car Rent", new AppUser(), new Client());

        Order order3 = new Order(LocalDateTime.parse("2019-07-01T20:00:00"), LocalDateTime.parse("2019-07-10T20:00:00"),
                "Card", "Car Rent", "Car Rent", new AppUser(), new Client());

        Order order4 = new Order(LocalDateTime.parse("2019-07-01T20:00:00"), LocalDateTime.parse("2019-07-10T20:00:00"),
                "Card", "Car Rent", "Car Rent", new AppUser(), new Client());

        Order order5 = new Order(LocalDateTime.parse("2019-07-01T20:00:00"), LocalDateTime.parse("2019-07-10T20:00:00"),
                "Card", "Car Rent", "Car Rent", new AppUser(), new Client());
         */
//        orderRepository.save(order1);
//        orderRepository.save(order2);
//        orderRepository.save(order3);
//        orderRepository.save(order4);
//        orderRepository.save(order5);
    }
}

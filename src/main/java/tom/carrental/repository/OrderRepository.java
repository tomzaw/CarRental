package tom.carrental.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tom.carrental.model.Order;

@Repository
public interface OrderRepository extends JpaRepository<Order, Integer> {}

package tom.carrental.controller;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import tom.carrental.model.AppUser;
import tom.carrental.model.Client;
import tom.carrental.model.Order;

@Controller
public class AdminOrderController {

    @GetMapping("/admin-order")
    public String adminOrder(Model mod) {

        List<Order> orders = new ArrayList<>();

        Order order1 = new Order(LocalDateTime.parse("2019-07-01T20:00:00"), LocalDateTime.parse("2019-07-10T20:00:00"),
                "Card", "Car Rent", "Car Rent", new AppUser(), new Client());
        order1.setId(1);
        orders.add(order1);
        Order order2 = new Order(LocalDateTime.parse("2019-07-01T20:00:00"), LocalDateTime.parse("2019-07-10T20:00:00"),
                "Card", "Car Rent", "Car Rent", new AppUser(), new Client());
        order2.setId(2);
        orders.add(order2);
        Order order3 = new Order(LocalDateTime.parse("2019-07-01T20:00:00"), LocalDateTime.parse("2019-07-10T20:00:00"),
                "Card", "Car Rent", "Car Rent", new AppUser(), new Client());
        order3.setId(3);
        orders.add(order3);
        Order order4 = new Order(LocalDateTime.parse("2019-07-01T20:00:00"), LocalDateTime.parse("2019-07-10T20:00:00"),
                "Card", "Car Rent", "Car Rent", new AppUser(), new Client());
        order4.setId(4);
        orders.add(order4);
        Order order5 = new Order(LocalDateTime.parse("2019-07-01T20:00:00"), LocalDateTime.parse("2019-07-10T20:00:00"),
                "Card", "Car Rent", "Car Rent", new AppUser(), new Client());
        order5.setId(5);
        orders.add(order5);

        mod.addAttribute("orders", orders);

        return "adminOrder";
    }

    @GetMapping("/admin-order-add/")
    public String adminOrderAddGet() {

        return "adminOrderAdd";
    }

    @PostMapping("/admin-order-add/")
    public String adminOrderAddPost() {

        return "adminOrder";
    }

    @GetMapping("/admin-order-edit/{id}")
    public String adminOrderEditGet(@PathVariable String id) {

        return "adminOrderEdit";
    }

    @PostMapping("/admin-order-edit/{id}")
    public String adminOrderEditPost(@PathVariable String id) {

        return "adminOrder";
    }

    @GetMapping("/admin-order-delete/{id}")
    public String adminOrderDelete(@PathVariable String id) {

        return "adminOrder";
    }
}

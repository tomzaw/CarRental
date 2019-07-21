package tom.carrental.controller;

import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import tom.carrental.model.AppUser;
import tom.carrental.model.Client;
import tom.carrental.model.Order;
import tom.carrental.model.Vehicle;
import tom.carrental.service.AppUserService;
import tom.carrental.service.ClientService;
import tom.carrental.service.OrderService;
import tom.carrental.service.VehicleService;

@Controller
public class AdminOrderController {

    private OrderService orderService;
    private AppUserService appUserService;
    private ClientService clientService;
    private VehicleService vehicleService;

    public AdminOrderController(OrderService orderService, AppUserService appUserService, ClientService clientService, VehicleService vehicleService) {
        this.orderService = orderService;
        this.appUserService = appUserService;
        this.clientService = clientService;
        this.vehicleService = vehicleService;
    }

    /*
    public AdminOrderController(OrderService orderService) {
        this.orderService = orderService;
    }
     */
    @GetMapping("/admin-order")
    public String adminOrder(Model mod) {
        /*
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
         */
        List<Order> orders = orderService.findAll();
        mod.addAttribute("orders", orders);
        return "adminOrder";
    }

    @GetMapping("/admin-order-add")
    public String adminOrderAddGet(Model mod) {

        mod.addAttribute("order", new Order());
        return "adminOrderAdd";
    }

    @PostMapping("/admin-order-add")
    public String adminOrderAddPost(Order order) {

        orderService.save(order);
        return "redirect:/admin-order";
    }

    @GetMapping("/admin-order-edit/{id}")
    public String adminOrderEditGet(@PathVariable int id, Model mod) {

        mod.addAttribute("order", new Order());
        return "adminOrderAdd";
    }

    @PostMapping("/admin-order-edit/{id}")
    public String adminOrderEditPost(@PathVariable int id) {

        orderService.save(orderService.find(id));
        return "redirect:/admin-order";
    }

    @GetMapping("/admin-order-delete/{id}")
    public String adminOrderDelete(@PathVariable int id) {

        orderService.delete(id);
        return "redirect:/admin-order";
    }

    @ModelAttribute("paymentOptionArray")
    public String[] paymentOptionArray() {

        String[] paymentOptionArray = new String[3];
        paymentOptionArray[0] = "cash";
        paymentOptionArray[1] = "card";
        paymentOptionArray[2] = "transfer";
        return paymentOptionArray;
    }

    @ModelAttribute("appUserList")
    public List<AppUser> appuserList() {

        List<AppUser> appUserList = appUserService.findAll();
        return appUserList;
    }

    @ModelAttribute("clientList")
    public List<Client> clientList() {

        List<Client> clientList = clientService.findAll();
        return clientList;
    }

    @ModelAttribute("vehicleList")
    public List<Vehicle> vehicleList() {

        List<Vehicle> vehicleList = vehicleService.findAll();
        return vehicleList;
    }
}

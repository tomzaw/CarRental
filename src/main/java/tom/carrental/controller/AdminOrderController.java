package tom.carrental.controller;

import java.util.List;
import javax.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
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

    @GetMapping("/admin-order")
    public String adminOrder(Model mod) {

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
    public String adminOrderAddPost(@Valid Order order, BindingResult errors) {

        if (errors.hasErrors()) {
            return "adminOrderAdd";
        }

        orderService.save(order);
        return "redirect:/admin-order";
    }

    @GetMapping("/admin-order-edit/{id}")
    public String adminOrderEditGet(@PathVariable int id, Model mod) {

        mod.addAttribute("order", orderService.find(id));
        return "adminOrderAdd";
    }

    @PostMapping("/admin-order-edit/{id}")
    public String adminOrderEditPost(@Valid Order order, BindingResult errors) {

        if (errors.hasErrors()) {
            return "adminOrderAdd";
        }

        orderService.save(order);
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

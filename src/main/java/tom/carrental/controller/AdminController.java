package tom.carrental.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class AdminController {

    @GetMapping("/admin-user")
    public String adminUser() {

        return "adminAppUser";
    }

    @GetMapping("/admin-client")
    public String adminClient() {

        return "adminClient";
    }

    @GetMapping("/admin-client-form")
    public String adminClientForms() {

        return "adminClientForm";
    }

    @GetMapping("/admin-order")
    public String adminOrder() {

        return "adminOrder";
    }

    @GetMapping("/admin-vehicle")
    public String adminCar() {

        return "adminVehicle";
    }

    @GetMapping("/admin-car/{company}/{model}/{version}")
    public String adminVehicle(@PathVariable String company, @PathVariable String model, @PathVariable String version, Model mod1) {

        mod1.addAttribute("company", company);
        mod1.addAttribute("model", model);
        mod1.addAttribute("version", version);

        return "vehicle";
    }

    @GetMapping("/admin-user-add/{id}")
    public String adminUserAdd(@PathVariable String id) {

        return "adminAppUser";
    }

    @GetMapping("/admin-client-add/{id}")
    public String adminClientAdd(@PathVariable String id) {

        return "adminClient";
    }

    @GetMapping("/admin-client-form-add/{id}")
    public String adminClientFormsAdd(@PathVariable String id) {

        return "adminClientForm";
    }

    @GetMapping("/admin-order-add/{id}")
    public String adminOrderAdd(@PathVariable String id) {

        return "adminOrder";
    }

    @GetMapping("/admin-vehicle-add/{id}")
    public String adminCarAdd(@PathVariable String id) {

        return "adminVehicle";
    }
    
    @GetMapping("/admin-user-edit/{id}")
    public String adminUserEdit(@PathVariable String id) {

        return "adminAppUser";
    }

    @GetMapping("/admin-client-edit/{id}")
    public String adminClientEdit(@PathVariable String id) {

        return "adminClient";
    }

    @GetMapping("/admin-client-form-edit/{id}")
    public String adminClientFormsEdit(@PathVariable String id) {

        return "adminClientForm";
    }

    @GetMapping("/admin-order-edit/{id}")
    public String adminOrderEdit(@PathVariable String id) {

        return "adminOrder";
    }

    @GetMapping("/admin-vehicle-edit/{id}")
    public String adminCarEdit(@PathVariable String id) {

        return "adminVehicle";
    }
    
    @GetMapping("/admin-user-delete/{id}")
    public String adminUserDelete(@PathVariable String id) {

        return "adminAppUser";
    }

    @GetMapping("/admin-client-delete/{id}")
    public String adminClientDelete(@PathVariable String id) {

        return "adminClient";
    }

    @GetMapping("/admin-client-form-delete/{id}")
    public String adminClientFormsDelete(@PathVariable String id) {

        return "adminClientForm";
    }

    @GetMapping("/admin-order-delete/{id}")
    public String adminOrderDelete(@PathVariable String id) {

        return "adminOrder";
    }

    @GetMapping("/admin-vehicle-delete/{id}")
    public String adminCarDelete(@PathVariable String id) {

        return "adminVehicle";
    }
}

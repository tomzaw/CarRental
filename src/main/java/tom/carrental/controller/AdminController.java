package tom.carrental.controller;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import tom.carrental.model.Vehicle;

//@Controller
public class AdminController {
/*
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
    public String adminCar(Model mod) {

        List<Vehicle> vehicles = new ArrayList<>();
        
        Vehicle vehicle1 = new Vehicle("Honda", "Accord", 1, "TDi", (float) 1.4, "white");
        vehicle1.setId(1);
        vehicles.add(vehicle1);
        Vehicle vehicle2 = new Vehicle("Mazda", "Cx-3", 1, "TDi", (float) 1.4, "white");
        vehicle2.setId(2);
        vehicles.add(vehicle2);
        Vehicle vehicle3 = new Vehicle("Nissan", "Qashqai", 1, "TDi", (float) 1.8, "grey");
        vehicle3.setId(3);
        vehicles.add(vehicle3);
        Vehicle vehicle4 = new Vehicle("Skoda", "Octavia", 1, "TDi", (float) 1.6, "white");
        vehicle4.setId(4);
        vehicles.add(vehicle4);
        Vehicle vehicle5 = new Vehicle();
        vehicle5.setId(5);
        vehicles.add(vehicle5);
        
        mod.addAttribute("vehicles", vehicles);
        
        return "adminVehicle";
    }

    @GetMapping("/admin-user-add")
    public String adminUserAdd(@PathVariable String id) {

        return "adminAppUser";
    }

    @GetMapping("/admin-client-add")
    public String adminClientAdd(@PathVariable String id) {

        return "adminClient";
    }

    @GetMapping("/admin-client-form-add/")
    public String adminClientFormsAdd(@PathVariable String id) {

        return "adminClientForm";
    }

    @GetMapping("/admin-order-add/")
    public String adminOrderAdd(@PathVariable String id) {

        return "adminOrder";
    }

    @GetMapping("/admin-vehicle-add")
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
    */
}

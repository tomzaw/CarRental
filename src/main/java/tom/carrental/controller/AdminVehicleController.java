package tom.carrental.controller;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import tom.carrental.model.Vehicle;

@Controller
public class AdminVehicleController {

    @GetMapping("/admin-vehicle")
    public String adminVehicle(Model mod) {

        List<Vehicle> vehicles = new ArrayList<>();

        Vehicle vehicle1 = new Vehicle("Honda", "Accord", 1, "TDi", 1.4f, "white");
        vehicle1.setId(1);
        vehicles.add(vehicle1);
        Vehicle vehicle2 = new Vehicle("Mazda", "Cx-3", 1, "TDi", 1.4f, "white");
        vehicle2.setId(2);
        vehicles.add(vehicle2);
        Vehicle vehicle3 = new Vehicle("Nissan", "Qashqai", 1, "TDi", 1.8f, "grey");
        vehicle3.setId(3);
        vehicles.add(vehicle3);
        Vehicle vehicle4 = new Vehicle("Skoda", "Octavia", 1, "TDi", 1.6f, "white");
        vehicle4.setId(4);
        vehicles.add(vehicle4);

        mod.addAttribute("vehicles", vehicles);

        return "adminVehicle";
    }

    @GetMapping("/admin-vehicle-add")
    public String adminVehicleAddGet() {

        return "adminVehicleAdd";
    }

    @PostMapping("/admin-vehicle-add")
    public String adminVehicleAddPost() {

        return "adminVehicle";
    }

    @GetMapping("/admin-vehicle-edit/{id}")
    public String adminVehicleEditGet(@PathVariable String id) {

        return "adminVehicleEdit";
    }

    @PostMapping("/admin-vehicle-edit/{id}")
    public String adminVehicleEditPost(@PathVariable String id) {

        return "adminVehicle";
    }

    @GetMapping("/admin-vehicle-delete/{id}")
    public String adminVehicleDelete(@PathVariable String id) {

        return "adminVehicle";
    }
}

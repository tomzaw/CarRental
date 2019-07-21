package tom.carrental.controller;

import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import tom.carrental.model.Vehicle;
import tom.carrental.service.VehicleService;

@Controller
public class AdminVehicleController {

    private VehicleService vehicleService;

    public AdminVehicleController(VehicleService vehicleService) {
        this.vehicleService = vehicleService;
    }

    @GetMapping("/admin-vehicle")
    public String adminVehicle(Model mod) {

        List<Vehicle> vehicles = vehicleService.findAll();
        mod.addAttribute("vehicles", vehicles);
        return "adminVehicle";
    }

    @GetMapping("/admin-vehicle-add")
    public String adminVehicleAddGet(Model mod) {

        mod.addAttribute("vehicle", new Vehicle());
        return "adminVehicleAdd";
    }

    @PostMapping("/admin-vehicle-add")
    public String adminVehicleAddPost(Vehicle vehicle) {

        vehicleService.save(vehicle);
        return "redirect:/admin-vehicle";
    }

    @GetMapping("/admin-vehicle-edit/{id}")
    public String adminVehicleEditGet(@PathVariable int id, Model mod) {

        mod.addAttribute("vehicle", vehicleService.find(id));
        return "adminVehicleAdd";
    }

    @PostMapping("/admin-vehicle-edit/{id}")
    public String adminVehicleEditPost(@PathVariable int id, Vehicle vehicle) {

        vehicleService.save(vehicle);
        return "redirect:/admin-vehicle";
    }

    @GetMapping("/admin-vehicle-delete/{id}")
    public String adminVehicleDelete(@PathVariable int id) {

        vehicleService.delete(id);
        return "redirect:/admin-vehicle";
    }
}

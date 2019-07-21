package tom.carrental.service;

import java.util.List;
import org.springframework.stereotype.Service;
import tom.carrental.model.Vehicle;
import tom.carrental.repository.VehicleRepository;

@Service
public class VehicleService {

    private VehicleRepository vehicleRepository;

    public VehicleService(VehicleRepository vehicleRepository) {
        this.vehicleRepository = vehicleRepository;
    }

    public List<Vehicle> findAll() {

        List<Vehicle> vehicles = vehicleRepository.findAll();
        return vehicles;
    }

    public Vehicle find(int id) {

        Vehicle vehicle = vehicleRepository.findById(id).get();
        return vehicle;
    }

    public void save(Vehicle vehicle) {

        vehicleRepository.save(vehicle);
    }

    public void delete(int id) {

        vehicleRepository.deleteById(id);
    }
}

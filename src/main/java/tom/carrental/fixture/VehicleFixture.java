package tom.carrental.fixture;

import javax.annotation.PostConstruct;
import org.springframework.stereotype.Component;
import tom.carrental.model.Vehicle;
import tom.carrental.repository.VehicleRepository;

@Component
public class VehicleFixture {

    private VehicleRepository vehicleRepository;

    public VehicleFixture(VehicleRepository vehicleRepository) {
        this.vehicleRepository = vehicleRepository;
    }

    @PostConstruct
    public void init() {

        Vehicle vehicle1 = new Vehicle("Honda", "Accord", 1, "TDi", 1.4f, "white");

        Vehicle vehicle2 = new Vehicle("Mazda", "Cx-3", 1, "TDi", 1.4f, "white");

        Vehicle vehicle3 = new Vehicle("Nissan", "Qashqai", 1, "TDi", 1.8f, "grey");

        Vehicle vehicle4 = new Vehicle("Skoda", "Octavia", 1, "TDi", 1.6f, "white");

        vehicleRepository.save(vehicle1);
        vehicleRepository.save(vehicle2);
        vehicleRepository.save(vehicle3);
        vehicleRepository.save(vehicle4);
    }
}

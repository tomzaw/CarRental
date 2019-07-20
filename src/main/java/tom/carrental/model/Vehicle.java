package tom.carrental.model;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Vehicle {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String company;
    private String model;
    private int version;
    private String engineName;
    private float engineVolume;
    private String color;
    @OneToMany(mappedBy = "vehicle")
    private List<Order> orders = new ArrayList<>();

    public Vehicle(String company, String model, int version, String engineName, float engineVolume, String color) {
        this.company = company;
        this.model = model;
        this.version = version;
        this.engineName = engineName;
        this.engineVolume = engineVolume;
        this.color = color;
    }

    public Vehicle() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    public String getEngineName() {
        return engineName;
    }

    public void setEngineName(String engineName) {
        this.engineName = engineName;
    }

    public float getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(float engineVolume) {
        this.engineVolume = engineVolume;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public List<Order> getOrders() {
        return orders;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }

    @Override
    public String toString() {
        return "Vehicle{" + "id=" + id + ", company=" + company + ", model=" + model + ", version=" + version + ", engineName=" + engineName + ", engineVolume=" + engineVolume + ", color=" + color + '}';
    }
}

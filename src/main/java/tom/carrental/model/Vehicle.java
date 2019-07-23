package tom.carrental.model;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Entity
public class Vehicle {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @NotBlank
    private String company;

    @NotBlank
    private String model;

    @NotNull
    private Integer version;

    @NotBlank
    private String engineName;

    @NotNull
    private Float engineVolume;

    @NotBlank
    private String color;

    @NotBlank
    private String description;

    @OneToMany(mappedBy = "vehicle")
    private List<Order> orders = new ArrayList<>();

    public Vehicle(String company, String model, Integer version, String engineName, Float engineVolume, String color) {
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

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public String getEngineName() {
        return engineName;
    }

    public void setEngineName(String engineName) {
        this.engineName = engineName;
    }

    public Float getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(Float engineVolume) {
        this.engineVolume = engineVolume;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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

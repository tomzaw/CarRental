package tom.carrental.model;

import java.time.LocalDateTime;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "orders")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @NotNull
    private LocalDateTime dateFrom;

    @NotNull
    private LocalDateTime dateTo;

    @NotBlank
    private String paymentType;

    @NotBlank
    private String title;

    private String description;

    @NotNull
    private LocalDateTime orderDate;

    @ManyToOne
    private AppUser appUser;
    @ManyToOne
    private Client client;
    @ManyToOne
    private Vehicle vehicle;

    public Order(LocalDateTime dateFrom, LocalDateTime dateTo, String paymentType, String title, String description, AppUser appUser, Client client) {
        this.dateFrom = dateFrom;
        this.dateTo = dateTo;
        this.paymentType = paymentType;
        this.title = title;
        this.description = description;
        this.appUser = appUser;
        this.client = client;
        this.orderDate = LocalDateTime.now();
    }

    public Order() {
        this.orderDate = LocalDateTime.now();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDateTime getDateFrom() {
        return dateFrom;
    }

    public void setDateFrom(LocalDateTime dateFrom) {
        this.dateFrom = dateFrom;
    }

    public LocalDateTime getDateTo() {
        return dateTo;
    }

    public void setDateTo(LocalDateTime dateTo) {
        this.dateTo = dateTo;
    }

    public String getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(String paymentType) {
        this.paymentType = paymentType;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public AppUser getAppUser() {
        return appUser;
    }

    public LocalDateTime getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(LocalDateTime orderDate) {
        this.orderDate = orderDate;
    }

    public void setAppUser(AppUser appUser) {
        this.appUser = appUser;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    @Override
    public String toString() {
        return "Order{" + "id=" + id + ", dateFrom=" + dateFrom + ", dateTo=" + dateTo + ", paymentType=" + paymentType + ", title=" + title + ", description=" + description + ", orderDate=" + orderDate + ", appUser=" + appUser + ", client=" + client + ", vehicle=" + vehicle + '}';
    }
}

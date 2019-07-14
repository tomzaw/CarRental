package tom.carrental.model;

import java.time.LocalDateTime;

public class Order {

    private int id;
    private LocalDateTime dateFrom;
    private LocalDateTime dateTo;
    private String paymentType;
    private String title;
    private String description;
    private AppUser appUser;
    private Client client;

    public Order(LocalDateTime dateFrom, LocalDateTime dateTo, String paymentType, String title, String description, AppUser appUser, Client client) {
        this.dateFrom = dateFrom;
        this.dateTo = dateTo;
        this.paymentType = paymentType;
        this.title = title;
        this.description = description;
        this.appUser = appUser;
        this.client = client;
    }

    public Order() {
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

    public void setAppUser(AppUser appUser) {
        this.appUser = appUser;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    @Override
    public String toString() {
        return "Order{" + "id=" + id + ", dateFrom=" + dateFrom + ", dateTo=" + dateTo + ", paymentType=" + paymentType + ", title=" + title + ", description=" + description + ", appUser=" + appUser + ", client=" + client + '}';
    }
}

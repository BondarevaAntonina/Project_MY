package homeworks.collection_online_store.entity;

import java.time.LocalDate;
import java.util.List;

public class CustomerOrder {

    private LocalDate dateCreated;
    private double amount;
    private Customer customer;

    private List<OrderDetail> orderDetailList;


    public CustomerOrder(double amount, LocalDate dateCreated) {
        this.amount = amount;
        this.dateCreated = dateCreated;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public LocalDate getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(LocalDate dateCreated) {
        this.dateCreated = dateCreated;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public void setCustomer(Person person) {
        this.customer = (Customer) person;
    }

    public List<OrderDetail> getOrderDetailList() {
        return orderDetailList;
    }

    public void setOrderDetailList(List<OrderDetail> orderDetailList) {
        this.orderDetailList = orderDetailList;
    }

    @Override
    public String toString() {
        return "CustomerOrder[customer=" + customer + "]";
    }


}

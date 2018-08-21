package homeworks.collection_online_store.events;

import java.time.LocalDate;

public class OrderEvent {

    private String nameOrder;
    private double amount;
    private LocalDate dateCreated;

    public OrderEvent(String nameOrder, double amount, LocalDate dateCreated) {
        this.nameOrder = nameOrder;
        this.amount = amount;
        this.dateCreated = dateCreated;
    }

    public String getNameOrder() {
        return nameOrder;
    }

    public void setNameOrder(String nameOrder) {
        this.nameOrder = nameOrder;
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

    public String toString() {
        return "OrderEvent " + nameOrder;
    }
}

package homeworks.collection_online_store.entity;

import java.util.ArrayList;
import java.util.List;

public class Customer extends Person {

    private List<CustomerOrder> customerOrderList;

    public Customer(String firstName, String lastName, String email, String address, String city, List <CustomerOrder> customerOrderList) {
        super(firstName, lastName, email, address, city);
        this.customerOrderList = new ArrayList<CustomerOrder>();
    }


    public List<CustomerOrder> getCustomerOrderList() {
        return customerOrderList;
    }

    public void setCustomerOrderList(List<CustomerOrder> customerOrderList) {
        this.customerOrderList = customerOrderList;
    }


    @Override
    public String toString() {
        return "Customer[firstname=" + firstname + "]";
    }
}

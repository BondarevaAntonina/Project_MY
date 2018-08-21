package homeworks.collection_online_store.entity;

import java.util.ArrayList;
import java.util.List;

public class Customer extends Person {

    private List<Customer> customerList;

    public Customer(List<Customer> customerList) {
        this.customerList = customerList;
    }

    public Customer(Integer id, List<Customer> customerList) {
        super(id);
        this.customerList = customerList;
    }

    public Customer(Integer id, String firstName, String lastName, String email, String address, String city, List<Customer> customerOrderList) {
        super(id, firstName, lastName, email, address, city);
        this.customerList = customerOrderList;
    }

    public Customer(Integer id, String firstname, String lastname, String email, String address, String city) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.email = email;
        this.address = address;
        this.city = city;
        this.customerList = new ArrayList<Customer>();
    }


    public List<Customer> getCustomerList() {
        return customerList;
    }

    public void setCustomerList(List<Customer> customerList) {
        this.customerList = customerList;
    }


    @Override
    public String toString() {
        return "Customer[id=" + id + "]";
    }
}

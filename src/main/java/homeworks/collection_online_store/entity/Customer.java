package homeworks.collection_online_store.entity;

import java.util.List;

/**
 * Клиент
 */

public class Customer extends Person {


    private List<Customer> customerList;

    public Customer(String firstname, String lastname, String email, String address, String city, List<Customer> customerList) {
        super(firstname, lastname, email, address, city);
        this.customerList = customerList;
    }

    public List<Customer> getCustomerList() {
        return customerList;
    }

    public void setCustomerList(List<Customer> customerList) {
        this.customerList = customerList;
    }


}

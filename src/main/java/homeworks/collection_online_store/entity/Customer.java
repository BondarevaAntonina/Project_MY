package homeworks.collection_online_store.entity;

import java.util.ArrayList;

/**
 * Клиент
 */

public class Customer extends Person {


    private ArrayList<Customer> customerList;

    public Customer(String firstname, String lastname, String email, String address, String city, ArrayList<Customer> customerList) {
        super(firstname, lastname, email, address, city);
        this.customerList = customerList;
    }

    public ArrayList<Customer> getCustomerList() {
        return customerList;
    }

    public void setCustomerList(ArrayList<Customer> customerList) {
        this.customerList = customerList;
    }


}

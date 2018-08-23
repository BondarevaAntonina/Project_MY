package homeworks.collection_online_store.entity;

import java.util.HashMap;
import java.util.Map;

/**
 * Человек
 */

public class Person {

    private String firstname;
    private String lastname;
    private String email;
    private String address;
    private String city;
    private Map<Product, Integer> bucket;

    public Person(String firstname, String lastname, String email, String address, String city) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.email = email;
        this.address = address;
        this.city = city;
        bucket = new HashMap<>();
    }


    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }


    @Override
    public String toString() {
        return "Person[ firstname =" + firstname + " ]";
    }

}
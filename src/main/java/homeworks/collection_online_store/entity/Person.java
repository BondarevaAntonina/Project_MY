package homeworks.collection_online_store.entity;

import java.util.HashMap;
import java.util.Map;


public class Person {

    private String firstname;
    private String lastname;
    private String email;
    private String address;
    private City city;
    private Map <Product, Integer> bucket;

    public Person(String firstName, String lastName, String email, String address, City city) {
        this.firstname = firstName;
        this.lastname = lastName;
        this.email = email;
        this.address = address;
        this.city = city;
        bucket = new HashMap <>();
    }

    @Override
    public String toString() {
        return firstname;
    }

}
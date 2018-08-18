package homeworks.collection_online_store.entity;

import homeworks.collection_online_store.entity.Groups;

import java.util.ArrayList;
import java.util.List;

public class Person {


    protected List<Groups> groupsList;
    protected Integer id;
    protected String firstname;
    protected String lastname;
    protected String email;
    protected String address;
    protected String city;

    public Person() {
        this.groupsList = new ArrayList<Groups>();
    }

    public Person(Integer id) {
        this.id = id;
        this.groupsList = new ArrayList<Groups>();
    }

    public Person(Integer id,
                  String firstName,
                  String lastName,
                  String email,
                  String address,
                  String city) {
        this.id = id;
        this.firstname = firstName;
        this.lastname = lastName;
        this.email = email;
        this.address = address;
        this.city = city;
        this.groupsList = new ArrayList<Groups>();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public List<Groups> getGroupsList() {
        return groupsList;
    }

    public void setGroupsList(List<Groups> groupsList) {
        this.groupsList = groupsList;
    }

    @Override
    public String toString() {
        return "Person[ id=" + id + " ]";
    }

}
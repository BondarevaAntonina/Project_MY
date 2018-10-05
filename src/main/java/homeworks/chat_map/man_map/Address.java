package homeworks.chat_map.man_map;

import homeworks.collection_online_store.entity.City;

/**
 * Created by antoni on 05.10.2018.
 */
public class Address {

    private Country country;
    private City city;
    private  String nameOfStreet;
    private int countOfCitizens;

    public Address(Country country, City city, String nameOfStreet, int countOfCitizens) {
        this.country = country;
        this.city = city;
        this.nameOfStreet = nameOfStreet;
        this.countOfCitizens = countOfCitizens;
    }

    public Country getCountry() {
        return country;
    }

    public City getCity() {
        return city;
    }

    public String getNameOfStreet() {
        return nameOfStreet;
    }

    public int getCountOfCitizens() {
        return countOfCitizens;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public void setNameOfStreet(String nameOfStreet) {
        this.nameOfStreet = nameOfStreet;
    }

    public void setCountOfCitizens(int countOfCitizens) {
        this.countOfCitizens = countOfCitizens;
    }

    @Override
    public String toString() {
        return "Address{" + "country=" +
                country + ", city=" +
                city + ", nameOfStreet='" +
                nameOfStreet + '\'' + ", countOfCitizens=" +
                countOfCitizens + '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Address address = (Address) o;

        if (countOfCitizens != address.countOfCitizens) return false;
        if (country != address.country) return false;
        if (city != address.city) return false;
        return nameOfStreet.equals(address.nameOfStreet);
    }

}

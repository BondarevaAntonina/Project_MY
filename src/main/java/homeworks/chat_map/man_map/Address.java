package homeworks.chat_map.man_map;

import homeworks.chat_map.man_map.City;

/**
 * Created by antoni on 05.10.2018.
 */
public class Address {

    private Country country;
    private City city;
    private String nameOfStreet;
    private int countOfCitizens;
    private String numberOfHome;

    public Address(Country country, City city, String nameOfStreet, int countOfCitizens, String numberOfHome) {
        this.country = country;
        this.city = city;
        this.nameOfStreet = nameOfStreet;
        this.countOfCitizens = countOfCitizens;
        this.numberOfHome = numberOfHome;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public String getNameOfStreet() {
        return nameOfStreet;
    }

    public void setNameOfStreet(String nameOfStreet) {
        this.nameOfStreet = nameOfStreet;
    }

    public int getCountOfCitizens() {
        return countOfCitizens;
    }

    public void setCountOfCitizens(int countOfCitizens) {
        this.countOfCitizens = countOfCitizens;
    }

    public String getNumberOfHome() {
        return numberOfHome;
    }

    public void setNumberOfHome(String numberOfHome) {
        this.numberOfHome = numberOfHome;
    }

    @Override
    public String toString() {
        return "Address{" +
                "country=" + country + ", " +
                "city=" + city + ", " +
                "nameOfStreet='" + nameOfStreet + '\'' + ", " +
                "countOfCitizens=" + countOfCitizens + ", " +
                "numberOfHome=" + numberOfHome + '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Address address = (Address) o;

        if (countOfCitizens != address.countOfCitizens) return false;
        if (country != address.country) return false;
        if (city != address.city) return false;
        if (!nameOfStreet.equals(address.nameOfStreet)) return false;
        return numberOfHome.equals(address.numberOfHome);
    }

    @Override
    public int hashCode() {
        int result = country.hashCode();
        result = 31 * result + city.hashCode();
        result = 31 * result + nameOfStreet.hashCode();
        result = 31 * result + countOfCitizens;
        result = 31 * result + numberOfHome.hashCode();
        return result;
    }
}

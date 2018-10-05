package homeworks.chat_map.man_map;

/**
 * Created by antoni on 05.10.2018.
 */
public class Address {

    private String country;
    private String city;
    private  String nameOfStreet;
    private int countOfCitizens;

    public Address(String country, String city, String nameOfStreet, int countOfCitizens) {
        this.country = country;
        this.city = city;
        this.nameOfStreet = nameOfStreet;
        this.countOfCitizens = countOfCitizens;
    }

    public String getCountry() {
        return country;
    }

    public String getCity() {
        return city;
    }

    public String getNameOfStreet() {
        return nameOfStreet;
    }

    public int getCountOfCitizens() {
        return countOfCitizens;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setCity(String city) {
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
        return "Address{" + "country='" + country + '\'' + ", " +
                "city='" + city + '\'' + ", " +
                "nameOfStreet='" + nameOfStreet + '\'' + ", " +
                "countOfCitizens=" + countOfCitizens + '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Address address = (Address) o;

        if (countOfCitizens != address.countOfCitizens) return false;
        if (!country.equals(address.country)) return false;
        if (!city.equals(address.city)) return false;
        return nameOfStreet.equals(address.nameOfStreet);
    }

    @Override
    public int hashCode() {
        int result = country.hashCode();
        result = 31 * result + city.hashCode();
        result = 31 * result + nameOfStreet.hashCode();
        result = 31 * result + countOfCitizens;
        return result;
    }
}

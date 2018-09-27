package homeworks.chat_map;

import homeworks.collection_online_store.entity.City;

import java.time.LocalDate;

/**
 * Создать приложение Чат на основе Map.
 * Приложение должно позволять:
 * - писать сообщение определенному зарегистрированному пользователю и если он имеет статус "В сети".
 * - сохранять историю переписки.
 * - выводить историю(за весь период и за определенный период).
 * - выводить личную информацию о пользователе(имя, фамилия, возраст).
 * - смена автора.
 * - регистрироваться пользователю.
 * - отправлять файлы.
 */
public class User {

    private String firstName;
    private String lastName;
    private String login;
    LocalDate dateOfBirth;
    private int ageUser;
    private City city;
    private NetworkStatus networkStatus;


    public User(String firstName, String lastName, String login, LocalDate dateOfBirth, int ageUser, City city, NetworkStatus networkStatus) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.login = login;
        this.dateOfBirth = dateOfBirth;
        this.ageUser = ageUser;
        this.city = city;
        this.networkStatus = networkStatus;
    }

    public User(String login, LocalDate dateOfBirth, City city) {

    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public int getAge() {
        return ageUser;
    }

    public void setAge(int age) {
        this.ageUser = age;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public NetworkStatus getNetworkStatus() {
        return networkStatus;
    }

    public void setNetworkStatus(NetworkStatus networkStatus) {
        this.networkStatus = networkStatus;
    }

    @Override
    public String toString() {
        return "User{" + "firstName='" +
                firstName + '\'' + ", lastName='" +
                lastName + '\'' + ", login='" +
                login + '\'' + ", dateOfBirth=" +
                dateOfBirth + ", ageUser=" +
                ageUser + ", city=" +
                city + ", networkStatus=" +
                networkStatus + '}';
    }


}

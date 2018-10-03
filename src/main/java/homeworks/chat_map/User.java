package homeworks.chat_map;

import homeworks.collection_online_store.entity.City;

import java.time.LocalDate;
import java.util.Objects;

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
    private LocalDate dateOfBirth;
    private int age;
    private City city;
    private NetworkStatus networkStatus;

    public User(String firstName, String lastName, String login, LocalDate dateOfBirth,
                int age, City city, NetworkStatus networkStatus) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.login = login;
        this.dateOfBirth = dateOfBirth;
        this.age = age;
        this.city = city;
        this.networkStatus = networkStatus;
    }

    public User() {
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLogin() {
        return login;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        User user = (User) o;

        if (age != user.age) return false;
        if (firstName != null ? !firstName.equals(user.firstName) : user.firstName != null) return false;
        if (lastName != null ? !lastName.equals(user.lastName) : user.lastName != null) return false;
        if (login != null ? !login.equals(user.login) : user.login != null) return false;
        if (dateOfBirth != null ? !dateOfBirth.equals(user.dateOfBirth) : user.dateOfBirth != null) return false;
        if (city != user.city) return false;
        return networkStatus == user.networkStatus;
    }

    @Override
    public int hashCode() {

        return Objects.hash(firstName, lastName, login, dateOfBirth, age, city, networkStatus);
    }

    @Override
    public String toString() {
        return "User{" + "firstName='" +
                firstName + '\'' + ", lastName='" +
                lastName + '\'' + ", login='" +
                login + '\'' + ", dateOfBirth=" +
                dateOfBirth + ", age=" +
                age + ", city=" +
                city + ", networkStatus=" +
                networkStatus + '}';
    }


}

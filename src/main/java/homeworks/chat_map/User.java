package homeworks.chat_map;

import homeworks.collection_online_store.entity.City;

import java.time.LocalDate;
import java.util.List;

/**
 * Создать приложение Чат на основе Map.
 Приложение должно позволять:
 - писать сообщение определенному зарегистрированному пользователю и если он имеет статус "В сети".
 - сохранять историю переписки.
 - выводить историю(за весь период и за определенный период).
 - выводить личную информацию о пользователе(имя, фамилия, возраст).
 - смена автора.
 - регистрироваться пользователю.
 - отправлять файлы.
 */
public class User {

    private String firstName;
    private String lastName;
    private String login;
    LocalDate dateOfBirth;
    private int age;
    private City city;
    private NetworkStatus networkStatus;
    private List[] users;

    public User(String firstName, String lastName, String login, LocalDate dateOfBirth, int age, City city,
                NetworkStatus networkStatus, List[] users) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.login = login;
        this.dateOfBirth = dateOfBirth;
        this.age = age;
        this.city = city;
        this.networkStatus = networkStatus;
        this.users = users;
    }

    public User() {

    }
}

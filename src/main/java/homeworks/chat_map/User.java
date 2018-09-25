package homeworks.chat_map;

import homeworks.collection_online_store.entity.City;

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
    private String email;
    private String address;
    private City city;
}

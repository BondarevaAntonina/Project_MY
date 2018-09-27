package homeworks.chat_map;

import homeworks.collection_online_store.entity.City;

import java.time.LocalDate;

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

public class TestOperationsChat {
    public static void main(String[] args) {

//        OparetionUserChat oparetionUserChat = new OparetionUserChat();
//
//        oparetionUserChat.showUsersList("KerMax");
//
        UserRegisterPresenter userRegisterPresenter = new UserRegisterPresenter();

        userRegisterPresenter.addUser("Barrom", LocalDate.now(), City.ODESSA);
        userRegisterPresenter.addUser("Trishova", LocalDate.now(), City.ODESSA);

        userRegisterPresenter.getClientsList();
    }

}

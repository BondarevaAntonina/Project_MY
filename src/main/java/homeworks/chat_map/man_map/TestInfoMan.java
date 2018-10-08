package homeworks.chat_map.man_map;

import homeworks.collection_online_store.entity.City;

/**
 * Created by antoni on 05.10.2018.
 */
public class TestInfoMan {

    public static void main(String[] args) {

      ManAddress manAddress = new ManAddress();

      manAddress.addMan(new Man("Kernosov", "Maksim", 33, 1,
                (new Address(Country.UKRAINE, City.KHARKOV, "ул. Пушкинская 84", 10000))));

      manAddress.addMan(new Man("Barvinov", "Roman", 30, 2,
                (new Address(Country.UKRAINE, City.ODESSA, "ул. Троицкая, 38", 5000))));

      manAddress.addMan(new Man("Paleev", "Oleg", 28, 2,
                (new Address(Country.BELARUS, City.GOMEL, "ул. Мазурова улица, 79,", 6000))));

      manAddress.addMan(new Man("Petrov", "Ivan", 36, 1,
                (new Address(Country.RUSSIA, City.UFA, "Маршала Жукова, дом 17, кв. 6", 4000))));

      manAddress.addMan(new Man("Sereda", "Aleksandr", 37, 1,
                (new Address(Country.BELARUS, City.MINSK, "ул. Троицкая, 8", 3000))));

      manAddress.addMan(new Man("Vasilcova", "Nataliya", 40, 3,
                (new Address(Country.UKRAINE, City.KIEV, "ул. Дружбы Народовб 299", 5000))));

      manAddress.addMan(new Man("Vasilcova", "Nataliya", 37, 2,
                (new Address(Country.RUSSIA, City.SOCHI, "ул. Сумсскаяб 72", 2000))));

      manAddress.selectMan();

      manAddress.selectAddress();
    }
}


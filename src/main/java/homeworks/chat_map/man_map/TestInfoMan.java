package homeworks.chat_map.man_map;

import homeworks.collection_online_store.entity.City;

/**
 * Created by antoni on 05.10.2018.
 */
public class TestInfoMan {

    public static void main(String[] args) {

      ManAddress manAddress = new ManAddress();

      manAddress.addMan(new Man("Kernosov", "Maksim", 33, 1,
                (new Address(Country.UKRAINE, City.KHARKOV, "ul. Pushkinskaya", 5000))));

      manAddress.addMan(new Man("Barvinov", "Roman", 30, 1,
                (new Address(Country.UKRAINE, City.KHARKOV, "ul. Pushkinskaya", 5000))));

      manAddress.addMan(new Man("Paleev", "Oleg", 28, 1,
                (new Address(Country.UKRAINE, City.KHARKOV, "ul. Pushkinskaya", 5000))));

      manAddress.addMan(new Man("Petrov", "Ivan", 36, 1,
                (new Address(Country.UKRAINE, City.KHARKOV, "ul. Pushkinskaya", 5000))));

      manAddress.addMan(new Man("Sereda", "Aleksandr", 37, 1,
                (new Address(Country.UKRAINE, City.KHARKOV, "ul. Pushkinskaya", 5000))));

      manAddress.addMan(new Man("Vasilcova", "Nataliya", 40, 1,
                (new Address(Country.UKRAINE, City.KHARKOV, "ul. Pushkinskaya", 5000))));

      manAddress.addMan(new Man("Vasilcova", "Nataliya", 37, 1,
                (new Address(Country.UKRAINE, City.KHARKOV, "ul. Pushkinskaya", 5000))));


    }
}


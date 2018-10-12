package homeworks.chat_map.man_map;

import homeworks.collection_online_store.entity.City;

/**
 * Created by antoni on 05.10.2018.
 */
public class TestInfoMan {

    public static void main(String[] args) {

      ManAddress manAddress = new ManAddress();

      manAddress.addMan(new Man("Kernosov", "Maksim", 19, 1,
                (new Address(Country.CANADA, City.OTTAVA, "ул. Пушкинская", 10000, "8"))));

      manAddress.addMan(new Man("Mishenko", "Andreu", 27, 1,
              (new Address(Country.CANADA, City.OTTAVA, "ул. Пушкинская", 10000, "3"))));

      manAddress.addMan(new Man("Barvinov", "Roman", 30, 2,
                (new Address(Country.UKRAINE, City.ODESSA, "ул. Троицкая", 5000, "38"))));

      manAddress.addMan(new Man("Paleev", "Oleg", 28, 2,
                (new Address(Country.BELARUS, City.GOMEL, "ул. Мазурова улица", 6000, "79"))));

      manAddress.addMan(new Man("Petrov", "Ivan", 18, 1,
                (new Address(Country.RUSSIA, City.UFA, "Маршала Жукова", 4000, "47"))));

      manAddress.addMan(new Man("Sereda", "Aleksandr", 37, 1,
                (new Address(Country.BELARUS, City.MINSK, "ул. Троицкая", 3000, "8"))));

      manAddress.addMan(new Man("Vasilcova", "Nataliya", 40, 3,
                (new Address(Country.UKRAINE, City.KIEV, "ул. Дружбы Народовб", 5000, "28"))));

      manAddress.addMan(new Man("Slavutish", "Nataliya", 37, 2,
                (new Address(Country.RUSSIA, City.SOCHI, "ул. Сумсскаяб", 2000, "72"))));

      manAddress.addMan(new Man("Malikova", "Ivan", 21, 1,
              (new Address(Country.RUSSIA, City.UFA, "Маршала Жукова, дом 17, кв. 6", 4000, "21" ))));

      manAddress.addMan(new Man("Karsilov", "Ivan", 47, 1,
              (new Address(Country.US, City.UFA, "Маршала Жукова", 4000, "6"))));

      manAddress.selectMan();

      System.out.println();

      manAddress.selectAddress();

      System.out.println();

      manAddress.selectAgeTwentyOrderByFirstName();

      System.out.println();

      manAddress.updateMan();

      System.out.println();

      manAddress.selectCountry();

      System.out.println();

      manAddress.selectGroupByCountOfChildren();

    }
}


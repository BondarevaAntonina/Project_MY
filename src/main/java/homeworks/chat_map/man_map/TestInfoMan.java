package homeworks.chat_map.man_map;



/**
 * Created by antoni on 05.10.2018.
 */
public class

TestInfoMan {

    public static void main(String[] args) {

      ManAddress manAddress = new ManAddress();

      manAddress.addMan(new Man("Kernosov", "Maksim", 40, 1,
              (new Address(Country.US, City.UFA, "ул. Пушкинская", 4, "8"))));

      manAddress.addMan(new Man("Kernosov", "Maksim", 19, 1,
                (new Address(Country.CANADA, City.OTTAVA, "ул. Пушкинская", 4, "8"))));
        manAddress.addMan(new Man("Kernosov", "Maksim", 19, 1,
                (new Address(Country.CANADA, City.OTTAVA, "ул. Пушкинская", 500, "8"))));

      manAddress.addMan(new Man("Mishenko", "Andreu", 27, 1,
                (new Address(Country.CANADA, City.OTTAVA, "ул. Пушкинская", 10000, "3"))));

      manAddress.addMan(new Man("Barvinov", "Roman", 30, 2,
                (new Address(Country.UKRAINE, City.ODESSA, "ул. Троицкая", 5000, "38"))));

      manAddress.addMan(new Man("Paleev", "Oleg", 28, 2,
                (new Address(Country.BELARUS, City.GOMEL, "ул. Мазурова улица", 6000, "79"))));

      manAddress.addMan(new Man("Petrov", "Ivan", 18, 1,
                (new Address(Country.RUSSIA, City.UFA, "Маршала Жукова", 4000, "47"))));

      manAddress.addMan(new Man("Sereda", "Aleksandr", 37, 2,
                (new Address(Country.BELARUS, City.MINSK, "ул. Троицкая", 3000, "8"))));

      manAddress.addMan(new Man("Vasilcova", "Nataliya", 40, 1,
                (new Address(Country.UKRAINE, City.KIEV, "ул. Дружбы Народов", 5000, "28"))));

      manAddress.addMan(new Man("Slavutish", "Nataliya", 37, 2,
                (new Address(Country.RUSSIA, City.SOCHI, "ул. Сумсская", 4000, "72"))));

      manAddress.addMan(new Man("Malikova", "Ivan", 21, 1,
                (new Address(Country.RUSSIA, City.UFA, "Маршала Жукова", 4000, "21" ))));

      manAddress.addMan(new Man("Karsilov", "Ivan", 47, 3,
                (new Address(Country.US, City.UFA, "Маршала Жукова", 4, "6"))));


/*      manAddress.selectMan();

      manAddress.selectAddress();

      manAddress.selectAgeTwentyOrderByFirstName();

      manAddress.updateMan();

      manAddress.selectCountry();*/

      manAddress.selectCountOfChildren();
      System.out.println();

      manAddress.selectCountOfChildrenAge();
      System.out.println();

      /*manAddress.selectAddressCityNameOfStreet();
      System.out.println();

      manAddress.selectAddressHavingCountOfCitizens();
      System.out.println();

      manAddress.selectManGroupByCityNameOfStreet();
      System.out.println();

      manAddress.selectManHavingCityNameOfStreet();
*/
    }
}



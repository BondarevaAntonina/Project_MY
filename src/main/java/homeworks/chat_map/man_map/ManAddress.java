package homeworks.chat_map.man_map;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * Created by antoni on 05.10.2018.
 */
public class ManAddress {

    //    private Map <Man, ArrayList <Address>> infoMan;
    private List <Man> men = new ArrayList <>();


    public ManAddress() {

    }


    public void addMan(Man man) {
        men.add(man);
    }

    public void selectMan() {
        System.out.println("SELECT * FROM Man");
//        men.stream().forEach(m -> System.out.println(m));
        men.forEach(System.out::println);

    }

    public void selectAddress() {
        System.out.println("SELECT * FROM Address");
        men.stream()
                .map(Man::getAddress)
                .forEach(System.out::println);

    }

    public void selectAgeTwentyOrderByFirstName() {
        System.out.println("SELECT firstName, lastName, countOfChildren FROM Man WHERE age >= 20 ORDER BY firstName");
        men.stream()
                .filter(m -> m.getAge() >= 20)
                .sorted(Comparator.comparing(n -> n.getFirstName()))
                .forEach(m -> System.out.println(m.getFirstName() + "  " +
                                                 m.getLastName() + "  " +
                         "Count of children:" + m.getCountOfChildren()));

    }

    public void updateMan() {
        System.out.println("UPDATE Man SET firstName = 'John', lastName = 'Kennedi', countOfChildren = 3 "
                + "WHERE " + "country == 'US' (or another country)");
        men.stream()
                .filter(man -> man.getAddress().getCountry().equals(Country.US))
                .forEach(man -> {
                    man.setFirstName("John");
                    man.setLastName("Kennedi");
                    man.setCountOfChildren(3);
                });
    }

    public void selectCountry() {
        System.out.println("SELECT firstName, lastName, nameOfStreet FROM Man "
                + "WHERE country == 'Canada' AND numberOfHome == 3 OR age >= 25");
        /*Predicate<Man> manPredicate = man -> man.getAge() >= 25 &&
                man.getAddress().getNumberOfHome().equals(3) ||
                man.getAge() >= 25;*/

        Predicate<Man> manPredicate = man -> man.getAge() >= 25;

        manPredicate.and(man -> man.getAddress().getNumberOfHome().equals(3));
        manPredicate.or(man -> man.getAddress().getCountry() == Country.CANADA);

        men.stream()
                .filter(manPredicate)
                .forEach(System.out::println);
    }

    public void selectCountOfChildren() {
        System.out.println("SELECT count(*) FROM Man GROUP BY countOfChildren");
         men
                 .stream()
                 .collect(Collectors.groupingBy(Man::getCountOfChildren, Collectors.counting()))
                 .forEach((key, value) -> System.out.println(value + "\t" + key));
    }

    public void selectCountOfChildrenAge() {
        System.out.println("SELECT count(*) FROM Man GROUP BY countOfChildren, age\"");

       men
               .stream().collect(Collectors.groupingBy(Man::getCountOfChildren, Collectors
               .groupingBy(Man::getAge, Collectors.counting())))
               .forEach((key, value) -> System.out.println("Count children: " + key + "\t" + "Count people: " + value));
    }

    public void selectAddressCityNameOfStreet() {
        System.out.println("SELECT count(*) FROM Address GROUP BY city, nameOfStreet");
        men
                .stream()
                .map(Man::getAddress).collect(Collectors.groupingBy(Address::getCountry, Collectors
                .groupingBy(Address::getNameOfStreet, Collectors.counting())))
                .forEach((key, value) -> System.out.println("Count city: " + key + "\t" + "nameOfStreet: " + value));
    }

    public void selectAddressHavingCountOfCitizens() {
        System.out.println("SELECT count(*) FROM Address GROUP BY city, nameOfStreet HAVING countOfCitizens > 4");
        men
                .stream()
                .map(Man::getAddress)
                .filter(man -> man.getCountOfCitizens()>4)
                .collect(Collectors.groupingBy(Address::getCountry, Collectors
                .groupingBy(Address::getNameOfStreet, Collectors.counting())))
                .forEach((key, value) -> System.out.println("Count city: " + key + "\t" + "nameOfStreet: " + value));
    }

    public void selectManGroupByCityNameOfStreet() {
        System.out.println("SELECT count(*) FROM Man GROUP BY city, nameOfStreet");
        men
                .stream()
                .map(Man::getAddress)
                .collect(Collectors.groupingBy(Address::getCountry, Collectors
                .groupingBy(Address::getNameOfStreet, Collectors.counting())))
                .forEach((key, value) -> System.out.println("Count city: " + key + "\t" + "nameOfStreet: " + value));
    }

    public void selectManHavingCityNameOfStreet() {
        System.out.println("SELECT count(*) FROM Man GROUP BY city, nameOfStreet");
        men
                .stream()
                .map(Man::getAddress)
                .filter(man -> man.getCountOfCitizens()>4)
                .collect(Collectors.groupingBy(Address::getCountry, Collectors
                .groupingBy(Address::getNameOfStreet, Collectors.counting())))
                .forEach((key, value) -> System.out.println("Count city: " + key + "\t" + "nameOfStreet: " + value));
    }
}


package homeworks.chat_map.man_map;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

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
        men.stream().forEach(m -> System.out.println(m));

    }

    public void selectAddress() {
        System.out.println("SELECT * FROM Address");
        men.stream()
                .map(list -> list.getAddress())
                .forEach(System.out::println);

    }

    public void selectAgeTwentyOrderByFirstName() {
        System.out.println("SELECT firstName, lastName, countOfChildren FROM Man WHERE age >= 20 ORDER BY firstName");
        men.stream()
                .filter(m -> m.getAge() > 20)
                .sorted(Comparator.comparing(n -> n.getFirstName()))
                .forEach(m -> System.out.println(m.getFirstName() + "  " + m.getLastName() + "  "
                        + "Count of children:" + m.getCountOfChildren()));

    }

    public void updateMan() {
        System.out.println("UPDATE Man SET firstName = 'John', lastName = 'Kennedi', countOfChildren = 3 "
                + "WHERE " + "country == 'US' (or another country)");
    }

    public void selectCountry() {
        System.out.println("SELECT firstName, lastName, nameOfStreet FROM Man "
                + "WHERE country == 'Canada' AND numberOfHome == 3 OR age >= 25");
        men.stream()
                .filter(w -> w.getAge() >= 25)
                .map(list -> list.getAddress())
                .filter(adr -> adr.getCountry().equals(Country.CANADA) && adr.getNumberOfHome().equals("3"))
                .forEach(System.out::println);


    }
}


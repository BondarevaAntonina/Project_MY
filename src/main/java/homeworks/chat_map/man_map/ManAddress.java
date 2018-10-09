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
        men.stream().map(list -> list.getAddress()).forEach(System.out::println);

    }

    public void selectAgeTwentyOrderByFirstName() {
        System.out.println("SELECT firstName, lastName, countOfChildren FROM Man WHERE age >= 20 ORDER BY firstName");
//        men.stream().filter(m -> m.getAge() > 20).map(Man::getFirstName).forEach(System.out::println);
        men.stream().filter(m -> m.getAge() > 20).sorted(Comparator.comparing(n -> n.getFirstName())).map(Man::getFirstName).forEach(System.out::println);
    }

}

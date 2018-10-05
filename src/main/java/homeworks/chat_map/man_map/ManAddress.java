package homeworks.chat_map.man_map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by antoni on 05.10.2018.
 */
public class ManAddress {

    private Map <Man, ArrayList <Address>> infoMan;

    public ManAddress() {
        this.infoMan = new HashMap <>();
    }

    public void addMan(Man man) {
        if (infoMan.containsKey(man)) {
            System.out.println("This man exists");
            return;
        }
        infoMan.put(man, new ArrayList <>());
        System.out.println(man);
    }

    public void selectMan() {

    }

}

package lessons.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class LearnMap {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();

        map.put(1, "One");

        map.put(2, "Two");

//        System.out.println(map.get(1));

        Map<Man, String> men = new HashMap<>();

        Man john = new Man(10, "John");

        Man steve = new Man(10, "John");

        men.put(john, "One");

        men.put(steve, "Two");

        /*
        * 1) equals and hashcode is overriden - 1 objects
        * 2) equals not overriden and hashcode is overriden - 2 objects
        * 3) equals overriden and hashcode not overriden - 2 objects
        * 4) equals overriden and hashcode const value - 1 objects
        * */

        System.out.println(men);

        Set<Map.Entry<Integer, String>> entries = map.entrySet();

        entries.forEach(entry -> {
//            System.out.println(entry.getKey() + entry.getValue());
        });

    }
}



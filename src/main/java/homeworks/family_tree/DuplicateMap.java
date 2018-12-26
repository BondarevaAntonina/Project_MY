package homeworks.family_tree;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by antoni on 22.12.2018.
 */
public class DuplicateMap {

    private Map<Person, ArrayList<Person>> m = new HashMap<>();

    public void put(Person k, Person v) {
        if (m.containsKey(k)) {
            m.get(k).add(v);
        } else {
            ArrayList<Person> arr = new ArrayList<>();
            arr.add(v);
            m.put(k, arr);
        }
    }

    public ArrayList<Person> get(Person k) {
        return m.get(k);
    }

    public Person get(Person k, int index) {
        return m.get(k).size() - 1 < index ? null : m.get(k).get(index);
    }

    /*
            List list;
        Set entrySet = familyMembers.entrySet();
        Iterator it = entrySet.iterator();
        System.out.println("  Object key  Object value");
        while (it.hasNext()) {
            Map.Entry mapEntry = (Map.Entry) it.next();
            list = (List) familyMembers.get(mapEntry.getKey());
            for (int j = 0; j < list.size(); j++) {
                System.out.println("\t" + mapEntry.getKey() + "\t  " + list.get(j));
            }
        }
     */
}

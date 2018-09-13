package lessons.collections;

import java.util.*;

public class LearnCollections {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

//        System.out.println();

        Iterator<Integer> iterator = list.iterator();

        /*while (iterator.hasNext()) {
            System.out.print(iterator.next());
        }*/

        /*for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        for (Integer integer : list) {

        }*/

        Set<Man> set = new HashSet<>();

        Comparator<Man> comparator = new Comparator<Man>() {
            @Override
            public int compare(Man o1, Man o2) {
                return Integer.compare(o1.getAge(), o2.getAge());
            }
        };

        set = new TreeSet<>(comparator);

        set.add(new Man(23, "John"));


    }
}


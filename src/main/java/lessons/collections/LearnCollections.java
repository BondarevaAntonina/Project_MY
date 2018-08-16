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

class Man implements Comparable<Man> {
    private int age;
    private String name;

    public Man(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(Man o) {
        return Integer.compare(this.age, o.getAge());
    }
}

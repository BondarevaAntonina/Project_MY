package lessons.collections.comparator;

import org.jetbrains.annotations.NotNull;

import java.util.*;

public class Person implements Comparable<Person>{
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public int compareTo(@NotNull Person o) {
        return Integer.compare(o.age, this.age);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

class TestComparator {
    public static void main(String[] args) {
        List<Person> people = new LinkedList<>();

        people.add(new Person("Steev", 40));
        people.add(new Person("John", 12));
        people.add(new Person("Jeff", 30));
        people.add(new Person("Jack", 22));

        Comparator<Person> comparator = (o1, o2) -> Integer.compare(o1.getAge(), o2.getAge());

        Collections.sort(people, comparator.reversed());

//        System.out.println(people);

        Iterator<Person> iterator = people.iterator();

        while (iterator.hasNext()) {
//            Person person = iterator.next();
            if (iterator.next().getAge() > 30) {
                iterator.remove();
            }
//            System.out.println(person);
        }

        /*for (int i = 0; i < people.size(); i++) {
//            System.out.println(people.get(i));

            Person person = people.get(i);
            if (person.getAge() > 30) {
                people.remove(person);
            }
        }*/

        System.out.println(people);

        /*for (Person person : people) {
            if (person.getAge() > 30) {
                people.remove(person);
            }
        }*/
    }
}

package homeworks.family_tree;


import homeworks.chat_map.man_map.Address;
import homeworks.chat_map.man_map.Country;
import homeworks.chat_map.man_map.Man;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * Создать приложение родословная. Приложение должно позволять:
 * 1) Выводить родословное дерево конкретного человека.
 * 2) Показывать прямых родственников
 * 3) Вычислять статистику по всему дереву: количество живых, мужчин/женщин, среднее количество детей,
 * среднюю продолжительность жизни
 * 4) Показывать прямых родственников с братьями и сёстрами, все родственники.
 * 5) Показывать степень родства двух людей в одной ветке дерева.
 */
public class Familly {

    private Map<Person, List<Person>> myChildren;

    public Familly() {
        this.myChildren = new HashMap<>();
        fillFamillyTree();
    }

    public void addChild(Person person, List<Person> people) {
        myChildren.put(person, people);
    }

    private void fillFamillyTree() {
        Person you = new Person("Zaxarova", "Dariya", "Yuriivna",
                Gender.WOMAN, 32, Duration.ALIVE, null, 0);
        Person zakharBrother = new Person("Zaxarov", "Alexseu", "Yuriivich",
                Gender.MAN, 28, Duration.ALIVE, Kinsman.BROTHER, 1);
        Person zakharSister = new Person("Zaxarova", "Marina", "Yuriivna",
                Gender.WOMAN, 36, Duration.ALIVE, Kinsman.SISTER, 2);
        Person strashko = new Person("Strashko", "Irina", "Yuriivna",
                Gender.WOMAN, 54, Duration.ALIVE, Kinsman.MOTHER, 3);
        Person kovalev = new Person("Kovalev", "Yuriu", "Sergeevich",
                Gender.MAN, 57, Duration.ALIVE, Kinsman.FATHER, 3);
        Person strashkoGrandFather = new Person("Strashko", "Yuriu", "Georgievich",
                Gender.MAN, 82, Duration.ALIVE, Kinsman.GRANDFATHER, 1);
        Person strashkoGrandMother = new Person("Strashko", "Valentina", "Aleksandrovna",
                Gender.WOMAN, 81, Duration.DEAD, Kinsman.GRANDMOTHER, 2);
        Person kovalevGrandFather = new Person("Kovalev", "Yuriu", "Markovich",
                Gender.MAN, 83, Duration.ALIVE, Kinsman.GRANDFATHER, 3);
        Person kovalevGrandMother = new Person("Kovaleva", "Mariya", "Genadievna",
                Gender.WOMAN, 80, Duration.DEAD, Kinsman.GRANDMOTHER, 1);
        Person kovalevGrandAunt = new Person("Kovaleva", "Alina", "Genadievna",
                Gender.WOMAN, 83, Duration.DEAD, Kinsman.AUNT, 1);
        Person strashkoGreatFather = new Person("Strashko", "Georgiu", "Vladimirovich",
                Gender.MAN, 82, Duration.DEAD, Kinsman.GREATGRANDFATHER, 1);
        Person vasilcovaGreatMother = new Person("Vasilcova", "Vera", "Aleksandrovna",
                Gender.WOMAN, 79, Duration.DEAD, Kinsman.GREATGRANDMOTHER, 2);
        Person seredaGreatFather = new Person("Sereda", "Aleksandr", "Petrovich",
                Gender.MAN, 82, Duration.DEAD, Kinsman.GREATGRANDFATHER, 2);
        Person seredaGreatMother = new Person("Sereda", "Margarita", "Michailovna",
                Gender.WOMAN, 68, Duration.DEAD, Kinsman.GREATGRANDMOTHER, 1);
        Person kovalevGreatFather = new Person("Kovalev", "Mark", "Valereevich",
                Gender.MAN, 67, Duration.DEAD, Kinsman.GREATGRANDFATHER, 3);
        Person kovalevGreatMother = new Person("Kovaleva", "Nataliya", "Alekseevna",
                Gender.WOMAN, 62, Duration.DEAD, Kinsman.GREATGRANDMOTHER, 2);
        Person danilenkoGreatFather = new Person("Danilenko", "Genadiu", "Sergeevich",
                Gender.MAN, 77, Duration.DEAD, Kinsman.GREATGRANDFATHER, 1);
        Person danilenkoGreatMother = new Person("Danilenko", "Illona", "Vladimirovna",
                Gender.WOMAN, 79, Duration.DEAD, Kinsman.GREATGRANDMOTHER, 1);

        addChild(you, Arrays.asList(zakharBrother, zakharSister, strashko, kovalev));
        addChild(zakharBrother, Arrays.asList(strashko, kovalev));
        addChild(zakharSister, Arrays.asList(strashko, kovalev));
        addChild(strashko, Arrays.asList(strashkoGrandFather, strashkoGrandMother));
        addChild(strashkoGrandFather, Arrays.asList(strashkoGreatFather, vasilcovaGreatMother));
        addChild(strashkoGrandMother, Arrays.asList(seredaGreatFather, seredaGreatMother));
        addChild(kovalev, Arrays.asList(kovalevGrandFather, kovalevGrandMother, kovalevGrandAunt));
        addChild(kovalevGrandFather, Arrays.asList(kovalevGreatFather, kovalevGreatMother));
        addChild(kovalevGrandMother, Arrays.asList(danilenkoGreatFather, danilenkoGreatMother));

    }

    // Выводить родословное дерево конкретного человека.
    public void familyTreeParticularPerson(Person person) {

        List<Person> people = myChildren.get(person);

        System.out.println(person);

        if(Objects.isNull(people)) {
            System.out.println(person);
            return;
        }

        System.out.println(people + "\nEnd tree of " + person.getFirstName() + "\t" + person.getSurname());

        people.forEach(this::familyTreeParticularPerson);

    }


    // Показывать прямых родственников
    public void showDirectRelatives(String surname, String firstname, String middlename) {
    myChildren.entrySet()
            .stream()
                .filter(e -> {
                    Person person = e.getKey();

                    return person.getSurname().equals(surname) &&
                    person.getFirstName().equals(firstname) &&
                    person.getMiddleName().equals(middlename);
                }).findFirst().get().getValue().forEach(System.out::println);

    }

    // Вычислять статистику по всему дереву: количество живых, мужчин/женщин, среднее количество детей,
    // * среднюю продолжительность жизни
    public void printInfoTree() {
        System.out.println(myChildren.keySet().stream().filter(p -> p.getDuration() == Duration.ALIVE).count());

    }

    public void showNumberGender() {

/*        Predicate<Person> manPredicate = person -> person.getGender().equals(Gender.MAN);
        myChildren.entrySet().stream().filter(e -> e.getValue().equals(manPredicate)).forEach(System.out::println);*/

//        List<Person> people = myChildren.entrySet().stream().filter(p -> p.getValue().contains(Gender.WOMAN)).map()
//
//        people.forEach(System.out::println);


    }


    public void showAverageNumberOfChildren() {

    }

    public void showAverageLifeExpectancy() {

    }

    public void showDirectRelativesBrotherSister() {

    }

    public void showAllRelatives() {

    }

}

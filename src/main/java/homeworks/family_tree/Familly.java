package homeworks.family_tree;


import homeworks.chat_map.man_map.Man;

import java.util.*;
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
                "G", 32, Duration.ALIVE, null);
        Person zakharBrother = new Person("Zaxarov", "Alexseu", "Yuriivich",
                "M", 28, Duration.ALIVE, Kinsman.BROTHER);
        Person zakharSister = new Person("Zaxarova", "Marina", "Yuriivna",
                "G", 36, Duration.ALIVE, Kinsman.SISTER);
        Person strashko = new Person("Strashko", "Irina", "Yuriivna",
                "G", 54, Duration.ALIVE, Kinsman.MOTHER);
        Person kovalev = new Person("Kovalev", "Yuriu", "Sergeevich",
                "M", 57, Duration.ALIVE, Kinsman.FATHER);
        Person strashkoGrandFather = new Person("Strashko", "Yuriu", "Georgievich",
                "M", 82, Duration.ALIVE, Kinsman.GRANDFATHER);
        Person strashkoGrandMother = new Person("Strashko", "Valentina", "Aleksandrovna",
                "G", 81, Duration.DEAD, Kinsman.GRANDMOTHER);
        Person kovalevGrandFather = new Person("Kovalev", "Yuriu", "Markovich",
                "M", 83, Duration.ALIVE, Kinsman.GRANDFATHER);
        Person kovalevGrandMother = new Person("Kovaleva", "Mariya", "Genadievna",
                "G", 80, Duration.DEAD, Kinsman.GRANDMOTHER);
        Person kovalevGrandAunt = new Person("Kovaleva", "Alina", "Genadievna",
                "G", 83, Duration.DEAD, Kinsman.GRANDMOTHER);
        Person strashkoGreatFather = new Person("Strashko", "Georgiu", "Vladimirovich",
                "M", 82, Duration.DEAD, Kinsman.GREATGRANDFATHER);
        Person vasilcovaGreatMother = new Person("Vasilcova", "Vera", "Aleksandrovna",
                "G", 79, Duration.DEAD, Kinsman.GREATGRANDMOTHER);
        Person seredaGreatFather = new Person("Sereda", "Aleksandr", "Petrovich",
                "M", 82, Duration.DEAD, Kinsman.GREATGRANDFATHER);
        Person seredaGreatMother = new Person("Sereda", "Margarita", "Michailovna",
                "G", 68, Duration.DEAD, Kinsman.GREATGRANDMOTHER);
        Person kovalevGreatFather = new Person("Kovalev", "Mark", "Valereevich",
                "M", 67, Duration.DEAD, Kinsman.GREATGRANDFATHER);
        Person kovalevGreatMother = new Person("Kovaleva", "Nataliya", "Alekseevna",
                "G", 62, Duration.DEAD, Kinsman.GREATGRANDMOTHER);
        Person danilenkoGreatFather = new Person("Danilenko", "Genadiu", "Sergeevich",
                "M", 77, Duration.DEAD, Kinsman.GREATGRANDFATHER);
        Person danilenkoGreatMother = new Person("Danilenko", "Illona", "Vladimirovna",
                "G", 79, Duration.DEAD, Kinsman.GREATGRANDMOTHER);


/*        addChild(you, Arrays.asList(strashko, kovalev));
        addChild(strashko, Arrays.asList(you, zakharBrother, zakharSister, strashkoGrandFather, strashkoGrandMother));
        addChild(strashkoGrandMother, Arrays.asList(strashkoGreatFather, vasilcovaGreatMother));*/
//
        addChild(you, Arrays.asList(zakharBrother, zakharSister, strashko, kovalev));
        addChild(strashko, Arrays.asList(strashkoGrandFather, strashkoGrandMother));
        addChild(strashkoGrandFather, Arrays.asList(strashkoGreatFather, vasilcovaGreatMother));
        addChild(strashkoGrandMother, Arrays.asList(seredaGreatFather, seredaGreatMother));
        addChild(kovalev, Arrays.asList(kovalevGrandFather, kovalevGrandMother, kovalevGrandAunt));
        addChild(kovalevGrandFather, Arrays.asList(kovalevGreatFather, kovalevGreatMother));
        addChild(kovalevGrandMother, Arrays.asList(danilenkoGreatFather, danilenkoGreatMother));



    }

    // Выводить родословное дерево конкретного человека.
    public void familyTreeParticularPerson(Person person) {
        /*myChildren.entrySet().stream().filter(p -> p.getValue().contains(person)).forEach(e -> {
            System.out.println(e.toString());
        });*/

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
//            .stream().filter(ppn.ALIVE)).collect(Collectors.counting()).
            .stream()
//                .filter(e -> e.getValue().equals(Duration.ALIVE))
                .filter(e -> {
                    Person person = e.getKey();

                    return person.getSurname().equals(surname) &&
                    person.getFirstName().equals(firstname) &&
                    person.getMiddleName().equals(middlename);
                }).findFirst().get().getValue().forEach(System.out::println);

    }

    public void printInfoTree() {
        System.out.println(myChildren.keySet().stream().filter(p -> p.getDuration() == Duration.ALIVE).count());
    }

    public void showNumberGender() {

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

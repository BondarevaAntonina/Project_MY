package homeworks.family_tree;


import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import static homeworks.family_tree.Gender.WOMAN;

/**
 * Создать приложение родословная. Приложение должно позволять:
 * 1) Выводить родословное дерево конкретного человека. - DONE
 * 2) Показывать прямых родственников - DONE
 * 3) Вычислять статистику по всему дереву: количество живых, мужчин/женщин, среднее количество детей,
 * среднюю продолжительность жизни - DONE
 * 4) Показывать прямых родственников с братьями и сёстрами, все родственники конкретного человека.
 * 5) Показывать степень родства двух людей в одной ветке дерева.
 */
public class Familly {

    private Map<Person, List<Person>> familyMembers;
    private Map<String, Double> infoMap;

    public Familly() {
        this.familyMembers = new HashMap<>();
        infoMap = new HashMap<>();
        fillInfoMap();
        fillFamillyTree();
    }

    private void fillInfoMap() {
        infoMap.put("Count of man", 0.0);
        infoMap.put("Count living", 0.0);
        infoMap.put("Count of woman", 0.0);
        infoMap.put("Count of children", 0.0);
        infoMap.put("Count average life expectancy", 0.0);
    }

    public void addChild(Person person, List<Person> people) {
        familyMembers.put(person, people);
    }

    private void fillFamillyTree() {
        Person you = new Person("Zaxarova", "Dariya", "Yuriivna", WOMAN, 32, Duration.ALIVE, null, 0);
        Person zakharBrother = new Person("Zaxarov", "Alexseu", "Yuriivich", Gender.MAN, 28, Duration.ALIVE, Kinsman.BROTHER, 1);
        Person zakharSister = new Person("Zaxarova", "Marina", "Yuriivna", WOMAN, 36, Duration.ALIVE, Kinsman.SISTER, 2);
        Person strashko = new Person("Strashko", "Irina", "Yuriivna", WOMAN, 54, Duration.ALIVE, Kinsman.MOTHER, 3);
        Person kovalev = new Person("Kovalev", "Yuriu", "Sergeevich", Gender.MAN, 57, Duration.ALIVE, Kinsman.FATHER, 3);
        Person strashkoGrandFather = new Person("Strashko", "Yuriu", "Georgievich", Gender.MAN, 82, Duration.ALIVE, Kinsman.GRANDFATHER, 1);
        Person strashkoGrandMother = new Person("Strashko", "Valentina", "Aleksandrovna", WOMAN, 81, Duration.DEAD, Kinsman.GRANDMOTHER, 2);
        Person kovalevGrandFather = new Person("Kovalev", "Yuriu", "Markovich", Gender.MAN, 83, Duration.ALIVE, Kinsman.GRANDFATHER, 3);
        Person kovalevGrandMother = new Person("Kovaleva", "Mariya", "Genadievna", WOMAN, 80, Duration.DEAD, Kinsman.GRANDMOTHER, 1);
        Person kovalevGrandAunt = new Person("Kovaleva", "Alina", "Genadievna", WOMAN, 83, Duration.DEAD, Kinsman.AUNT, 1);
        Person strashkoGreatFather = new Person("Strashko", "Georgiu", "Vladimirovich", Gender.MAN, 82, Duration.DEAD, Kinsman.GREATGRANDFATHER, 1);
        Person vasilcovaGreatMother = new Person("Vasilcova", "Vera", "Aleksandrovna", WOMAN, 79, Duration.DEAD, Kinsman.GREATGRANDMOTHER, 2);
        Person seredaGreatFather = new Person("Sereda", "Aleksandr", "Petrovich", Gender.MAN, 82, Duration.DEAD, Kinsman.GREATGRANDFATHER, 2);
        Person seredaGreatMother = new Person("Sereda", "Margarita", "Michailovna", WOMAN, 68, Duration.DEAD, Kinsman.GREATGRANDMOTHER, 1);
        Person kovalevGreatFather = new Person("Kovalev", "Mark", "Valereevich", Gender.MAN, 67, Duration.DEAD, Kinsman.GREATGRANDFATHER, 3);
        Person kovalevGreatMother = new Person("Kovaleva", "Nataliya", "Alekseevna", WOMAN, 62, Duration.DEAD, Kinsman.GREATGRANDMOTHER, 2);
        Person danilenkoGreatFather = new Person("Danilenko", "Genadiu", "Sergeevich", Gender.MAN, 77, Duration.DEAD, Kinsman.GREATGRANDFATHER, 1);
        Person danilenkoGreatMother = new Person("Danilenko", "Illona", "Vladimirovna", WOMAN, 79, Duration.DEAD, Kinsman.GREATGRANDMOTHER, 1);

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
    public void familyTreeParticularPerson(Person person) {//you

        List<Person> people = familyMembers.get(person);

        System.out.println(person);

        if (Objects.isNull(people)) {
            System.out.println(person);
            return;
        }

        System.out.println(people + "\nEnd tree of " + person.getFirstName() + "\t" + person.getSurname());

        people.forEach(this::familyTreeParticularPerson);

    }

    // Вычислять статистику по всему дереву: количество живых, мужчин/женщин, среднее количество детей, среднюю продолжительность жизни
    private void fillInformation(Person person) {

        List<Person> people = familyMembers.get(person);

        if (Objects.isNull(people)) {
            return;
        }

        Predicate<Person> predicate = m -> m.getCountChildren() < 4;
        Predicate<Person> predicateMan = m -> m.getSurname().equals(person);
        Predicate<Person> predicateAge = m -> m.getAge() <= 50;

        double countAlive =  people.stream().filter(p -> p.getDuration() == Duration.ALIVE).count();
        double countMan =  people.stream().filter(p -> p.getGender() == Gender.MAN).count();
//        int countMan = (int) people.stream().filter(p -> p.getGender() == Gender.MAN).filter(predicateMan).count();
        double countWomen =  people.stream().filter(p -> p.getGender() == Gender.WOMAN).count();
//        int countChildren = (int) people.stream().filter(p -> p.getCountChildren() > 2).filter(predicate).count();
        double countChildren = people.stream().mapToInt(Person::getCountChildren).average().getAsDouble();
        double countAge = people.stream().mapToInt(Person::getAge).average().getAsDouble();


        infoMap.merge("Count living", countAlive, (oldValue, newValue) -> oldValue + newValue);
        infoMap.merge("Count of man", countMan, (oldValue, newValue) -> oldValue + newValue);
        infoMap.merge("Count of woman", countWomen, (oldValue, newValue) -> oldValue + newValue);
        infoMap.merge("Count of children", countChildren, (oldValue, newValue) -> oldValue + newValue);
        infoMap.merge("Count average life expectancy", countAge, (oldValue, newValue) -> oldValue + newValue);

        people.forEach(this::fillInformation);

    }

    public void collectInfo() {

        Person you = new Person("Zaxarova", "Dariya", "Yuriivna", WOMAN, 32, Duration.ALIVE, null, 0);

        fillInformation(you);

        System.out.println(infoMap);

//        familyMembers.entrySet().stream().collect(Collectors.groupingBy(e -> e.getKey().getGender(), Collectors.counting()));

    }

    // Показывать прямых родственников
    public void showDirectRelatives(String surname, String firstname, String middlename) {
        familyMembers.entrySet().stream().filter(e -> {
            Person person = e.getKey();

            return person.getSurname().equals(surname) && person.getFirstName().equals(firstname) && person.getMiddleName().equals(middlename);
        }).findFirst().get().getValue().forEach(System.out::println);

    }

    public void showDirectRelativesBrotherSister(Person person) {

        List<Person> people = familyMembers.get(person);
        familyMembers.get(person).stream()
                .filter(m -> m.getKinsman() == Kinsman.BROTHER || m.getKinsman() == Kinsman.SISTER)
                .forEach(System.out::println);

    }

    public void showAllRelatives() {

    }

}
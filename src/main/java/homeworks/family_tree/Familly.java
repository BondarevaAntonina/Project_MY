package homeworks.family_tree;

import java.util.*;

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
                "G", 36, Duration.ALIVE, Kinsman.BROTHER);
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


        addChild(you, Arrays.asList(strashko, kovalev));
        addChild(strashko, Arrays.asList(you, zakharBrother, zakharSister, strashkoGrandFather, strashkoGrandMother));
        addChild(strashkoGrandMother, Arrays.asList(strashkoGreatFather, vasilcovaGreatMother));


    }

    // Выводить родословное дерево конкретного человека.
    public void familyTreeParticularPerson(Person person) {
//        myChildren.entrySet()
    }

    public void showDirectRelatives() {

    }

    public void showNumberOfLiving() {

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

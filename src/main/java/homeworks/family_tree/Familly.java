package homeworks.family_tree;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
    }

    public void addChild(Person person, List<Person> people) {
        ArrayList<Person> list = new ArrayList<>();
        Person zakharHusbend = new Person("Zaxarov", "Petr", "Vladimirovich", "M",
                70, Duration.DEAD, Kinsman.HUSBAND);
        Person zakharWife = new Person("Zaxarova", "Mariya", "Alexandrovna", "G",
                69, Duration.DEAD, Kinsman.WIFE);
        Person seredaDaughter = new Person("Sereda", "Vera", "Petrovna", "G",
                65, Duration.DEAD, Kinsman.SISTER);
        Person seredaTwoDaughter = new Person("Sereda", "Margarita", "Petrovna", "G",
                57, Duration.DEAD, Kinsman.SISTER);
        Person seredaFather = new Person("Sereda", "Radion", "Michailovich", "M",
                68, Duration.DEAD, Kinsman.HUSBAND);
        Person kovaleva = new Person("Kovaleva", "Lyudmila", "Radionovna", "G",
                59, Duration.DEAD, Kinsman.SISTER);


        myChildren.put(zakharHusbend, list);

    }

    public void familyTreeParticularPerson() {

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

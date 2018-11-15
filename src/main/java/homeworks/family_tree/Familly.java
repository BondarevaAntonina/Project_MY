package homeworks.family_tree;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 Создать приложение родословная. Приложение должно позволять:
 1) Выводить родословное дерево конкретного человека.
 2) Показывать прямых родственников
 3) Вычислять статистику по всему дереву: количество живых, мужчин/женщин, среднее количество детей,
 среднюю продолжительность жизни
 4) Показывать прямых родственников с братьями и сёстрами, все родственники.
 5) Показывать степень родства двух людей в одной ветке дерева.
 */
public class Familly {

    private Map<Person, List<Person>> myChildren;

    public Familly() {
        this.myChildren = new HashMap<>();
    }

    public void addChild(Person person, List<Person> people) {
        ArrayList<Person> list = new ArrayList<>();
        Person zakhar = new Person("Zaxarov", "Petr", "Vladimirovich", "M", 70,
                Duration.DEAD);
/*        .add(zakhar);
        child.add(new Child("Zaxarova", "Mariya", "Alexandrovna", "G", 65,
                Duration.DEAD, "Petrovna"));
        child.add(new Child("Zaxarova", "Mariya", "Alexandrovna", "G", 65,
                Duration.DEAD, "Petrovna"));*/

        myChildren.put(zakhar, list);

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

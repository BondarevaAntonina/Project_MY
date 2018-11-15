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
public class Family {

    private Map<Person, List<Child>> myChildren;

    public Family() {
        this.myChildren = new HashMap<>();
    }

    public void addChild(Child child) {
        myChildren.put(child, new ArrayList<>());
        /*List<Child> child = new ArrayList <>();
        child.add(new Child("Zaxarov", "Petr", "Vladimirovich", "M", 70,
                Duration.DEAD, "Petrovna"));
        child.add(new Child("Zaxarova", "Mariya", "Alexandrovna", "G", 65,
                Duration.DEAD, "Petrovna"));
        child.add(new Child("Zaxarova", "Mariya", "Alexandrovna", "G", 65,
                Duration.DEAD, "Petrovna"));*/

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

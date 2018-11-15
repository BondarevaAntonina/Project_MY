package homeworks.family_tree;

/**
 * Создать приложение родословная. Приложение должно позволять:
 * 1) Выводить родословное дерево конкретного человека.
 * 2) Показывать прямых родственников
 * 3) Вычислять статистику по всему дереву: количество живых, мужчин/женщин, среднее количество детей, среднюю продолжительность жизни
 * 4) Показывать прямых родственников с братьями и сёстрами, все родственники.
 * 5) Показывать степень родства двух людей в одной ветке дерева.
 */
public interface Featureble {

    void familyTreeParticularPerson();

    void showDirectRelatives();

    void showNumberOfLiving();

    void showNumberGender();

    void showAverageNumberOfChildren();

    void showAverageLifeExpectancy();

    void showDirectRelativesBrotherSister();

    void showAllRelatives();


}

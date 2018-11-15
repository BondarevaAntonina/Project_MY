package homeworks.family_tree;

import java.time.LocalDate;

/**
 Создать приложение родословная. Приложение должно позволять:
 1) Выводить родословное дерево конкретного человека.
 2) Показывать прямых родственников
 3) Вычислять статистику по всему дереву: количество живых, мужчин/женщин, среднее количество детей,
  среднюю продолжительность жизни
 4) Показывать прямых родственников с братьями и сёстрами, все родственники.
 5) Показывать степень родства двух людей в одной ветке дерева.
 */
public class Person implements Featureble {

    private String surname;
    private String firstName;
    private String middleName;
    private String gender;
    private LocalDate dateOfBirth;
    private Duration duration;
    private Person myFather;
    private Person myMother;


    @Override
    public void familyTreeParticularPerson() {

    }

    @Override
    public void showDirectRelatives() {

    }

    @Override
    public void showNumberOfLiving() {

    }

    @Override
    public void showNumberGender() {

    }

    @Override
    public void showAverageNumberOfChildren() {

    }

    @Override
    public void showAverageLifeExpectancy() {

    }

    @Override
    public void showDirectRelativesBrotherSister() {

    }

    @Override
    public void showAllRelatives() {

    }
}

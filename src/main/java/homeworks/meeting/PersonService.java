package homeworks.meeting;


import homeworks.learn_enum.Sex;

import java.util.Objects;

public class PersonService {
    private Man[] men;

    public PersonService() {
        men = new Man[10];
    }

//Регистрироваться человеку старше 18 лет

    public void addPersonWithMaxAge(Man man) {

        if (man.getAge() <= 18) {
            System.out.println();

            return;
        }

        for (int i = 0; i < men.length; i++) {

            if (Objects.isNull(men[i])) {
                men[i] = man;
                break;
            }
        }

        showSuitablePersonsByAgeAndSex(man);
    }

    private void showSuitablePersonsByAgeAndSex(Man man) {
        for (Man temp : men) {
            if (temp.getAge() == man.getAge() && temp.getSex() != man.getSex()) {
                man.showDataPerson();
            }
        }
    }

    // Просматривать зарегистрировавшихся людей. Для мужчин выводить только женщин и наоборот.
    public void showRegistrationPerson(Sex sex) {
        for (Man man : men) {
            if (sex != man.getSex()) {
                man.showDataPerson();
            }
        }

    }

    //Просматривать анкету отдельного человека(поиск по имени и фамилии)
    public void searchManByFirstNameAndLastName(String name, String surname) {
        for (Man man : men) {
            if (man.getName().equals(name) && man.getSurname().equals(surname)) {
                man.showDataPerson();
            }
        }
    }

    //Организовать "умный поиск". Пользователь вводит требования(город, пол, возраст, количество детей)
    //   и  выводить людей, которые соответствуют требованиям
    public void smartSearchCitySexAgeChildren(String city, Sex sex, int age, int children) {
        for (Man man : men) {
            if (man.getCity().equals(city) && sex == man.getSex() && age==man.getAge() && children== man.getChildren()) {
                man.showDataPerson();
            }
        }
    }
}

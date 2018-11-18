package homeworks.family_tree;

/**
 Создать приложение родословная. Приложение должно позволять:
 1) Выводить родословное дерево конкретного человека.
 2) Показывать прямых родственников
 3) Вычислять статистику по всему дереву: количество живых, мужчин/женщин, среднее количество детей,
  среднюю продолжительность жизни
 4) Показывать прямых родственников с братьями и сёстрами, все родственники.
 5) Показывать степень родства двух людей в одной ветке дерева.
 */
public class Person  {

    private String surname;
    private String firstName;
    private String middleName;
    private String gender;
    private int age;
    private Duration duration;
    private Kinsman kinsman;

    public Person(String surname, String firstName, String middleName, String gender, int age, Duration duration, Kinsman kinsman) {
        this.surname = surname;
        this.firstName = firstName;
        this.middleName = middleName;
        this.gender = gender;
        this.age = age;
        this.duration = duration;
        this.kinsman = kinsman;
    }

    @Override
    public String toString() {
        return "Person{" +
                "surname='" + surname + '\'' +
                ", firstName='" + firstName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                ", duration=" + duration +
                ", kinsman=" + kinsman +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person person = (Person) o;

        if (age != person.age) return false;
        if (!surname.equals(person.surname)) return false;
        if (!firstName.equals(person.firstName)) return false;
        if (!middleName.equals(person.middleName)) return false;
        if (!gender.equals(person.gender)) return false;
        if (duration != person.duration) return false;
        return kinsman == person.kinsman;
    }

    @Override
    public int hashCode() {
        int result = surname.hashCode();
        result = 31 * result + firstName.hashCode();
        result = 31 * result + middleName.hashCode();
        result = 31 * result + gender.hashCode();
        result = 31 * result + age;
        result = 31 * result + duration.hashCode();
        result = 31 * result + kinsman.hashCode();
        return result;
    }
}

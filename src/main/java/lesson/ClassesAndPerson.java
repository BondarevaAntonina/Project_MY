package lesson;

/**
 * Created by antoni on 16.03.2018.
 */
public class ClassesAndPerson {
    public static void main(String[] args) {
        PersonPeaple person1 = new PersonPeaple();
        person1.name = "Рома";
        person1.age = 50;
        PersonPeaple person2 = new PersonPeaple();
        person2.name = "Вова";
        person2.age = 20;
        int years1 = person1.calculateYearsToRetirement();
        int years2 =person2.calculateYearsToRetirement();
        System.out.println("Первому человеку до пенсии: "+years1+" лет");
        System.out.println("Второму человеку до пенсии: "+years2+" лет");
    }
}

class PersonPeaple {
    String name;
    int age;

    int calculateYearsToRetirement(){
        int years = 65 - age;
        return years;
    }

//    void calculateYearsToRetirement() {
//        int years = 65 - age;
//        System.out.println("Количество лет до пенсии "+years);
//    }

    void speak() {
        for (int i = 0; i < 3; i++) {
            System.out.println("Меня зовут " + name + ",мне" + age + " лет");
        }
    }

    void sayHello() {
        System.out.println("Привет!");
    }
}
